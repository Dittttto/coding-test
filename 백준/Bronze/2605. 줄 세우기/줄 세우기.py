N = int(input())
numbers = list(map(int,input().split()))
Q = []
for std,num in enumerate(numbers):
    if not Q:
        Q.append(std+1)
    else:
        Q.insert(len(Q)-num,std+1)
print(*Q)