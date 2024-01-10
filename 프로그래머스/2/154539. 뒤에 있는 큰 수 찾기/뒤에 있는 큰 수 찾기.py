def solution(numbers):
    answer = [-1] * len(numbers)
    reNumbers = numbers[::-1]
    right = []
    idx = len(numbers) - 1
    max = 0
    
    while idx > -1:
        target = numbers.pop()
        reNumbers.pop()
        
        if len(numbers) > 1 and reNumbers == numbers:
            break;
            
        if max < target:
            max = target
        else:
            for i in range(len(right) - 1, -1, -1):
                if right[i] > target:
                    answer[idx] = right[i]
                    break
                
                right.pop()
                    
                

        right.append(target)
        idx -= 1
    return answer