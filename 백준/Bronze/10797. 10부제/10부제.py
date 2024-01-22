import sys

input = sys.stdin.readline


def main():
    day = int(input())
    count = 0
    for i in list(map(int, input().split())):
        if i % 10 == day % 10:
            count += 1
    print(count)


main()
