import math
import sys

input = sys.stdin.readline


def main():
    n = int(input())
    not_prime = 0
    for i in list(map(int, input().split())):
        if i < 2:
            not_prime += 1
            continue
        for j in range(2, int(math.sqrt(i)) + 1):
            if i % j == 0:
                not_prime += 1
                break

    print(n-not_prime)


main()
