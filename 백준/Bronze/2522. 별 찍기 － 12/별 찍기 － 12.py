import sys

input = sys.stdin.readline


def main():
    n = int(input())
    star = ""
    for i in range(n):
        for j in range(n - i - 1):
            star += ' '
        for j in range(i + 1):
            star += '*'
        star += '\n'
    for i in range(n - 1):
        for j in range(i + 1):
            star += ' '
        for j in range(n - i - 1):
            star += '*'
        if i < n-2:
            star += '\n'
    print(star)

main()
