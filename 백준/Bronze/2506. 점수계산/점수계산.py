import sys

input = sys.stdin.readline


def main():
    num = int(input())
    total = 0
    count = 1
    for i in list(map(int, input().split())):
        if i == 0:
            count = 0
        total += count
        count += 1
    print(total)


main()
