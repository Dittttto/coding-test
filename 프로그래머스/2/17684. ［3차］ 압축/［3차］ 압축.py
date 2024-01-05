def solution(msg):
    answer = []
    alphabet = [chr(i) for i in range(65, 91)]
    
    idx = 0
    
    while idx < len(msg):
        
        char = ""
        for i in range(idx, len(msg)):            
            if char + msg[i] not in alphabet:
                idx = i
                alphabet.append(char + msg[i])
                answer.append(alphabet.index(char)+1)
                break
                
            char += msg[i]
            if i == len(msg) - 1 :
                answer.append(alphabet.index(char)+1)
                idx = i+1
    
    return answer