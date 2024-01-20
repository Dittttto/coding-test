import sys

input = sys.stdin.readline


def main():
    hour, minute, second = map(int, input().split(":"))
    hour2, minute2, second2 = map(int, input().split(":"))
    toSeconds = hour * 3600 + minute * 60 + second
    toSeconds2 = hour2 * 3600 + minute2 * 60 + second2

    if toSeconds > toSeconds2:
        result = 24 * 3600 - toSeconds + toSeconds2
    else:
        result = toSeconds2 - toSeconds

    target_hour = result // 3600
    result -= target_hour * 3600
    target_minute = result // 60
    result -= target_minute * 60
    target_second = result

    print(f"{target_hour:02}:{target_minute:02}:{target_second:02}")


main()
