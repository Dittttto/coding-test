import math
import sys

input = sys.stdin.readline


def main():
    m = int(input())
    n = int(input())
    total = 0
    min_value = 10001
    for i in range(m, n+1):
        is_prime = True
        if i < 2:
            continue
        for j in range(2, int(math.sqrt(i)) + 1):
            if i % j == 0:
                is_prime = False
                break
        if not is_prime:
            continue

        total += i
        if min_value > i:
            min_value = i

    if total == 0:
        print(-1)
        return

    print(total)
    print(min_value)


main()
