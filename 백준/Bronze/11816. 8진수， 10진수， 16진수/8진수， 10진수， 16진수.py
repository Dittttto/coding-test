import sys
input = sys.stdin.readline


def main():
    n = input().strip()

    if n.startswith("0x"):
        print(int(n, 16))
    elif n.startswith("0"):
        print(int(n, 8))
    else:
        print(n)



main()
