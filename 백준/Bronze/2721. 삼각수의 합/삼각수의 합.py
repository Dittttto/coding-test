import sys

input = sys.stdin.readline


def getTriangular(num):
    return (num * (num + 1)) // 2


def main():
    n = int(input())

    for i in range(n):
        num = int(input())
        result = 0
        for i in range(1, num + 1):
            result += i * getTriangular(i + 1)

        print(result)

main()