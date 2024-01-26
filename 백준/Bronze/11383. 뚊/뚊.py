import sys

input = sys.stdin.readline


def main():
    n, m = map(int, input().split())
    rowA = []
    rowB = []

    for i in range(n):
        rowA.append(list(input().strip()))

    for i in range(n):
        rowB.append(input().strip())

    newArray = []
    for i in range(n):
        temp = ""
        for j in rowA[i]:
            temp += j
            temp += j
        newArray.append(temp)

    for i in range(n):
        if newArray[i] != rowB[i]:
            print("Not Eyfa")
            return
    print("Eyfa")

main()
