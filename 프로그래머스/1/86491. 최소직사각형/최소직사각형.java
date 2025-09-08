class Solution {
    public int solution(int[][] sizes) {
        int se = 0, ga = 0;
        if(sizes[0][0] > sizes[0][1]){
            se =sizes[0][0]; ga = sizes[0][1];
        } else{
            se =sizes[0][1]; ga = sizes[0][0];
        }
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                se = sizes[i][0] > se ? sizes[i][0] : se;
                ga = sizes[i][1] > ga ? sizes[i][1] : ga;
            } else {
                se = sizes[i][1] > se ? sizes[i][1] : se;
                ga = sizes[i][0] > ga ? sizes[i][0] : ga;
            }
        }
        return se*ga;
    }
}