import math
import sys

input = sys.stdin.readline


def main():
    total = 0
    min_value = 101
    for i in range(7):
        num = int(input())
        if num % 2 != 0:
            total += num
            if min_value > num:
                min_value = num

    if total == 0:
        print(-1)
        return

    print(total)
    print(min_value)


main()
