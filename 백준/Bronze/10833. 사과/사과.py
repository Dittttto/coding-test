import sys

input = sys.stdin.readline


def main():
    n = int(input())
    sum = 0
    for i in range(n):
        numS, numA = map(int, input().split())
        sum += numA - (numA // numS) * numS
    print(sum)


main()
