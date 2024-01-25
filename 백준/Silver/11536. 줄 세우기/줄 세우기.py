import sys

input = sys.stdin.readline


def main():
    n = int(input().strip())
    name = [input().strip() for _ in range(n)]
    sorted_name = name[::]
    sorted_name.sort()
    reversed_name = name[::]
    reversed_name.sort(reverse=True)

    if name == reversed_name:
        print("DECREASING")
    elif name == sorted_name:
        print("INCREASING")
    else:
        print("NEITHER")


main()
