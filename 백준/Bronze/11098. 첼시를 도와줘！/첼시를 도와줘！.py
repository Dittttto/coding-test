import sys

input = sys.stdin.readline


def main():
    n = int(input())
    result = []
    for i in range(n):
        num = int(input())
        maxValue = 0
        who = ""
        for j in range(num):
            value, name = input().split()
            value = int(value)
            if value > maxValue:
                maxValue = value
                who = name
        result.append(who)

    for name in result:
        print(name)


main()
