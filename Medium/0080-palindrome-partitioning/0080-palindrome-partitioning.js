/**
 * @param {string} s
 * @return {string[][]}
 */
var partition = function(s) {
    const answer = [];
    backtrack(answer, [], s, 0);

    return answer;
};

function backtrack(answer, cur, s, index){
    if(index === s.length){
        answer.push([...cur]);
        return;
    }

    for(let end = index; end < s.length; end++){
        if(isPalindrome(s, index, end)){
            cur.push(s.substring(index, end + 1));
            backtrack(answer, cur, s, end + 1);
            cur.pop();
        }
    }
}

function isPalindrome(s, left, right){
    while(left < right){
        if(s.charAt(left) !== s.charAt(right)) return false;

        left = left + 1;
        right = right - 1;
    }
    return true;
}