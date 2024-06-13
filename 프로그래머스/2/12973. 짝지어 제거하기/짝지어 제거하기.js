function solution(s)
{
    var answer = -1;
    const arr = [];
    
    for(let c of s) {
        if(arr.length != 0 && arr[arr.length - 1] == c) {
            arr.pop();
        }else {
            arr.push(c);
        }
    }

    return arr.length == 0 ? 1 : 0;
}