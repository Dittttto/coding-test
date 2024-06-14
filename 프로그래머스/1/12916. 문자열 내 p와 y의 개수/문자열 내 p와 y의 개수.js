function solution(s){
    var answer = true;
    let pc = 0;
    let yc = 0;
    
    s = s.toLowerCase();
    
    for(let i of s) {
        if(i === 'p') {
            pc += 1;
        }else if (i === 'y') {
            yc += 1;
        }
    }
    
    if(pc === 0 && yc === 0){
        return true;
    }

    return pc === yc;
}