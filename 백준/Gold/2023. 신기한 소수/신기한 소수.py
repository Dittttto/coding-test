import sys

sys.setrecursionlimit(100000)

input = sys.stdin.readline

def checkPrimeNumber(num):

    for i in range(2, num // 2 + 1):
        if num % i == 0:
            return False

    return True


def dfs(v, length, limit):
    if length == limit:
        print(v)
        return


    for i in range(1, 10):
        num = v * 10 + i
        if checkPrimeNumber(num):

            dfs(num, length+1, limit)


def main():
    n = int(input())

    for i in range(2, 10):
        if checkPrimeNumber(i):
            dfs(i, 1, n)

main()