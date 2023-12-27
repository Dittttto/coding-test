word = list(input())

left = 0
right = len(word) - 1
isP = 1

while(left < right):
    if word[left] != word[right]:
        isP = 0
        break
    left += 1
    right -=1

print(isP)