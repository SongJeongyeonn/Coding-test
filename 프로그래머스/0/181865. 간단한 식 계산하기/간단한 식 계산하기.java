class Solution {
    public int solution(String binomial) {
        String[] obj = binomial.split(" ");
        int num1 = Integer.parseInt(obj[0]);
        int num2 = Integer.parseInt(obj[2]);
        if(obj[1].equals("+"))
            return num1+num2;
        else if(obj[1].equals("-"))
            return num1-num2;
        else
            return num1*num2;
    }
}