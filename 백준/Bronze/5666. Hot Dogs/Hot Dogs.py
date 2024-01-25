import sys
input = sys.stdin.readline


def main():
    while True:
        record = input().strip()
        if not record:
            return
        h, p = map(int, record.split())

        print(f"{(h/p):.02f}")

main()
