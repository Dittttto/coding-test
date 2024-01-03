import sys

input = sys.stdin.readline

multi = 1
arr = [0]*10
for i in range(3):
    multi *= int(input())
while multi:
    arr[multi % 10] += 1
    multi //= 10
for i in arr:
    print(i)