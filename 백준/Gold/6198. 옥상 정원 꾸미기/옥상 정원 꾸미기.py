import sys
input = sys.stdin.readline

b = int(input())

left = []
right = []
cur = [0] * b

for i in range(b):
    h = int(input())
    left.append([h, i])

idx = 0
while left:
    item = left.pop()
    height = item[0]
    idx = item[1]
    tmp = 0
    while right and right[-1][0] < height:
        rItem = right.pop()
        tmp += 1 + cur[rItem[1]]
    cur[idx] = tmp
    right.append(item)

result = 0
for i in cur:
    result += i
print(result)
