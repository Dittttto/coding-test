function solution(nums) {
    let answer = 0;
    const p = Array.from({length:3000},()=>1);
    
    
    for(let i =2; i<3000;i++){
        for(let j =2; j<3000;j++){
            if(i*j < 3000){
                p[i*j] = 0;
            }else{
                break;
            }
        }
    }
    
    for(let i= 0; i<nums.length;i++){
        for(let j = i+1; j<nums.length;j++){
            for(let k = j+1; k<nums.length;k++){
                if(p[nums[i]+nums[j]+nums[k]] === 1){
                    answer++;
                }
            }
        }
    }
    
    return answer;
}