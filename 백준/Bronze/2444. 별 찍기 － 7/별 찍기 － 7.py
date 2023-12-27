n = int(input())

for i in range(n):
    star = ""
    for j in range(n-i-1):
        star += " "
    for j in range(2*i+1):
        star += "*"
    print(star)

for i in range(1, n):
    star = ""
    for j in range(i):
        star += " "
    for j in range(2*n-2*i-1):
        star += "*"
    print(star)
