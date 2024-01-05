import sys
input = sys.stdin.readline

def main():
    n = int(input())
    for i in range(n):
        a , b = input().strip().split(" ")
        a_word = {}
        b_word = {}

        for c in a:
            if c in a_word:
                a_word[c] += 1
            else:
                a_word[c] = 1

        for c in b:
            if c in b_word:
                b_word[c] += 1
            else:
                b_word[c] = 1

        result = "Possible"
        for i,v in b_word.items():
            if i not in a_word:
                result = "Impossible"
                break

            if a_word[i] != v:
                result = "Impossible"
                break

        print(result)

main()