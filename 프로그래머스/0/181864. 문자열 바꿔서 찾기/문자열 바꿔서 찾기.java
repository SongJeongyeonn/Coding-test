class Solution {
    public int solution(String myString, String pat) {
         StringBuilder converted = new StringBuilder();
        for (char c : myString.toCharArray())
            converted.append(c == 'A' ? 'B' : 'A');
        return converted.toString().contains(pat) ? 1 : 0;
    }
}