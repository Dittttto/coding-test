import math
import sys

input = sys.stdin.readline

def isPrimeNumber(number):
    for i in range(2, int(math.sqrt(number)) + 1):
        if number % i == 0:
            return False
    return True

def main():
    result = 0
    for i in list(input().strip()):
        if ord("a") <= ord(i) <= ord("z"):
            result += ord(i) - ord("a") + 1
        else:
            result += ord(i) - ord("A") + 27
    if result == 1 or isPrimeNumber(result):
        print("It is a prime word.")
    else:
        print("It is not a prime word.")


main()
