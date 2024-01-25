import sys

input = sys.stdin.readline


def main():
    major = [int(input().strip()) for i in range(4)]
    sub = [int(input().strip()) for i in range(2)]
    major.sort()
    sub.sort()

    print(sum(major[1:]) + sum(sub[1:]))


main()
