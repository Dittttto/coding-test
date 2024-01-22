import math
import sys

input = sys.stdin.readline


def main():
    n = int(input())
    for i in range(n):
        m = int(input())
        sum_of_num = 0
        for j in list(map(int, input().split())):
            sum_of_num += j
        print(sum_of_num)
main()
