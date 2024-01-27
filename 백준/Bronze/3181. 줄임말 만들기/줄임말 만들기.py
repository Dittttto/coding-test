import sys

input = sys.stdin.readline


def main():
    ban_words = ['i', 'pa', 'te', 'ni', 'niti', 'a', 'ali', 'nego', 'no', 'ili']
    words = input().split()
    result = ""
    for i in range(len(words)):
        word = words[i]

        if i != 0 and word in ban_words:
            continue

        result += word[0].upper()
    print(result)

main()
