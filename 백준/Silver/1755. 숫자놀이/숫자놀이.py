import sys

input = sys.stdin.readline
def main():
    n, m = map(int, input().split())

    alphabet = ["zero", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine"]
    alphabet_to_dict = {i:j for i, j in zip(alphabet, range(len(alphabet)))}
    arr = []
    for i in range(n, m+1):
        temp = ""
        while i > 0:
            temp = alphabet[i%10] + " " + temp
            i //= 10

        arr.append(temp)
    arr = sorted(arr)
    count = 1
    for num_str in arr:
        for char in num_str.strip().split(" "):
            print(alphabet_to_dict[char], end="")
        if count % 10 == 0:
            print()
        else:
            print(end=" ")

        count += 1


main()
