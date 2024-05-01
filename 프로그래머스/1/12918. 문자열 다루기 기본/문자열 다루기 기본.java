class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6){ // 4와 6이 아닐때 false를 준다.
            answer = false;
        }
        else{
            for(int i = 0; i < s.length(); i++){// 인덱스는 0부터 시작하기에, i의 초기값을 0으로 준다.
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){} // 각 인덱스의 값이 조건에 맞는 숫자인지 확인한다.
                else // 아닐 시 false를 준다.
                    answer = false;
            }
        }
        return answer; 
    }
}