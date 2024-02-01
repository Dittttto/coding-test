import sys

input = sys.stdin.readline


def main():
    while True:

        vowel = ["a", "e", "i", "o", "u"]
        word = input().strip()
        if word == "#":
            return

        arr = list(word)
        startIdx = 0
        for i, v in enumerate(arr):
            if v in vowel:
                startIdx = i
                break

        result = "".join(arr[startIdx:]) + "".join(arr[:startIdx]) + "ay"
        print(result)
main()
