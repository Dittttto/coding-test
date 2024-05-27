function solution(s){
    const list = [];
    
    for(let i of s){
        if(i === ")") {
            if(list.length === 0) {
                return false;
            }
            
            list.pop();
        }else {
            list.push(i);
        }
    }
    
    if(list.length === 0) {
        return true
    }

    return false;
}