import sys

input = sys.stdin.readline


def main():
    n = int(input())

    for i in range(n):
        num = int(input())
        totalC = 0
        avg = 0.0
        for j in range(num):
            c, g = map(float, input().split())
            totalC += int(c)
            avg += g * int(c)

        avg /= totalC
        print(totalC, avg)


main()
