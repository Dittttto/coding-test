import string
import sys

input = sys.stdin.readline
memo = string.digits + string.ascii_uppercase

def convert(num, base):
    share, remainder = divmod(num, base)
    if share == 0:
        return memo[remainder]

    return convert(share, base) + memo[remainder]

def main():

    m, n = list(map(int, input().split()))

    print(convert(m, n))

main()