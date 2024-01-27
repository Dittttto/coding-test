import sys

input = sys.stdin.readline


def main():
    ban_words = ['i', 'pa', 'te', 'ni', 'niti', 'a', 'ali', 'nego', 'no', 'ili']
    words = input().split()
    result = ""
    for i in range(len(words)):
        if i != 0 and words[i] in ban_words:
            continue

        result += words[i][0].upper()
    print(result)


main()
