class Solution {
    public String[] solution(String[] strArr) {
        int size = strArr.length;
        for(int i = 0; i < size; i++){
            if(i % 2 == 0)
                strArr[i] = strArr[i].toLowerCase();
            else
                strArr[i] = strArr[i].toUpperCase();
        }
        return strArr;
    }
}