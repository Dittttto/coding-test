import sys

input = sys.stdin.readline

words = list(input().strip())
alphabet = list(map(chr, range(ord('a'), ord('z')+1)))
count = {k:0 for k in alphabet}

for i in words:
    count[i] += 1


for v in count.values():
    print(v, end=" ")