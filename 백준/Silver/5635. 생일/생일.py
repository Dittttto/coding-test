import sys
input = sys.stdin.readline

def main():
    n = int(input())

    birth = []

    for i in range(n):
        name, day, month, year = input().strip().split();
        birth.append({'name':name, 'day': int(day), 'month': int(month), 'year': int(year)})

    birth = sorted(birth, key = lambda item: (item['year'], item['month'], item['day']))

    print(birth[-1]['name'])
    print(birth[0]['name'])

main()