import sys

input = sys.stdin.readline

words = list(input().strip())
alph = [0] * 26
for i in words:
    alph[(ord(i) - ord('a'))] += 1

for i in alph:
    print(i, end=" ")