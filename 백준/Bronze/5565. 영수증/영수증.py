import sys

input = sys.stdin.readline


def main():
    total = int(input())
    temp = 0
    for i in range(9):
        temp  += int(input())
    print(total - temp)

main()
