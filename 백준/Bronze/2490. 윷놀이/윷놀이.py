import sys

input = sys.stdin.readline


def getResult(num):
    if num == 0:
        return "E"
    elif num == 1:
        return "A"
    elif num == 2:
        return "B"
    elif num == 3:
        return "C"
    else:
        return "D"


def main():
    for i in range(3):
        num = list(map(int, input().split())).count(0)
        print(getResult(num))


main()
