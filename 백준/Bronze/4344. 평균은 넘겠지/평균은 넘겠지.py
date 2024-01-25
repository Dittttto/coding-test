import sys
input = sys.stdin.readline


def main():
    n = int(input().strip())

    for i in range(n):
        inputs = list(map(int, input().strip().split()))
        numOfStudent = inputs[0]
        scores = inputs[1:]
        avg = sum(scores) / numOfStudent
        upperAvgStudent = (len([i for i in scores if i > avg]) / numOfStudent) * 100
        print(f"{upperAvgStudent:.03f}%")

main()
