import sys

input = sys.stdin.readline


def main():
    total_score = 0
    for i in range(5):
        total_score += int(input())
    print(total_score)


main()
