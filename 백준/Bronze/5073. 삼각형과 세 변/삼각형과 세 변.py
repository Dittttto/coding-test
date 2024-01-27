import sys

input = sys.stdin.readline


def main():
    while True:
        a, b, c = map(int, input().split())

        if a == 0 and b == 0 and c == 0:
            return

        total_length = sum([a, b, c])
        max_value = max([a, b, c])

        if total_length - max_value <= max_value:
            print("Invalid")
            continue

        if a == b == c:
            print("Equilateral")
        elif a != b and a != c and b != c:
            print("Scalene")
        else:
            print("Isosceles")


main()
