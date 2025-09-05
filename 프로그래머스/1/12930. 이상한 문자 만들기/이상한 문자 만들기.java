class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] parts = s.split(" ", -1);

        for (int i = 0; i < parts.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < parts[i].length(); j++) {
                char ch = parts[i].charAt(j);
                if (j % 2 == 0) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
            }
            answer.append(sb);
            if (i < parts.length - 1) answer.append(" ");
        }
        return answer.toString();
    }
}
