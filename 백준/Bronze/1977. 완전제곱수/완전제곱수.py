import sys

input = sys.stdin.readline

def main():
    m = int(input())
    n  = int(input())
    arr = []
    minValue = n + 1
    for i in range(m, n + 1):
        for j in range(1, n + 1):
            if j * j == i:
                arr.append(i);
                if minValue > i:
                    minValue = i
                break

    if minValue == n + 1:
        print(-1)
        return

    print(sum(arr))
    print(minValue)

main()