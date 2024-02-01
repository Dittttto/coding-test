import sys

input = sys.stdin.readline


def main():
    now_hour, now_minute, now_second = map(int, input().split(":"))
    throw_hour, throw_minute, throw_second = map(int, input().split(":"))

    now_to_second = now_hour * 60 * 60 + now_minute * 60 + now_second
    throw_to_second = throw_hour * 60 * 60 + throw_minute * 60 + throw_second
    result = 0
    
    if now_to_second == throw_to_second:
        print("24:00:00")
        return 

    if now_to_second > throw_to_second:
        result = 24 * 60 * 60 - now_to_second + throw_to_second
    else:
        result = throw_to_second - now_to_second

    hour = result // 3600
    result -= hour * 3600
    minute = result // 60
    result -= minute * 60
    second = result

    print(f"{hour:02}:{minute:02}:{second:02}")

main()
