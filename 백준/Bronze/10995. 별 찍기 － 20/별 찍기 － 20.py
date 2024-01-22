import sys

input = sys.stdin.readline


def main():
    n = int(input())
    star = ""
    for i in range(n):
        if i % 2 == 1:
            star += " "

        for j in range(n):
            star += "* "
        star += "\n"

    print(star)

main()
