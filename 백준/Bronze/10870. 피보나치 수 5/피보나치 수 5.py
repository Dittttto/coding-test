import sys

input = sys.stdin.readline

def fibonnaci(n):
    if n < 2:
        return n
    return fibonnaci(n-1) + fibonnaci(n-2)

def main():
    n = int(input())
    print(fibonnaci(n))

main()