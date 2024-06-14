function solution(s){
    let pc = 0;
    let yc = 0;
    
    for(let i of s.toLowerCase()) {
        if(i === 'p') {
            pc += 1;
        }else if (i === 'y') {
            yc += 1;
        }
    }

    return pc === yc;
}