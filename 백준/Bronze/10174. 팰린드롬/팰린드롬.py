import sys
input = sys.stdin.readline


def main():
    n = int(input().strip())

    for i in range(n):
        word = input().strip().lower()
        print("Yes" if word[::-1] == word else "No")

main()
