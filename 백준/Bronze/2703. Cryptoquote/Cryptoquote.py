import sys


input = sys.stdin.readline


def main():
    for _ in range(int(input())):
        encryptor = list(input().strip())
        key = list(input().strip())

        result = ""
        for word in encryptor:
            if word == " ":
                result += word
            else:
                result += key[ord(word) - ord("A")]
        print(result)

main()