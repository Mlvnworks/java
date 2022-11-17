class Solution {
    int[] filter(int base, int[][] arr){
        for(int i = 0; i < arr.length;i++){
            if(arr[i][1] == base){
                return  arr[i];
            }
        }
        return null;
    }

    boolean inArray(int[] intArr, int find){
        boolean state = false;
        for(int i = 0; i < intArr.length; i++){
                if(intArr[i] == find){
                    state = true;
                }
        }
        return state;
    }

    int[] solution(int n,int[][] paths,int[] gates, int[] summits){
        int tryCount = 0;
        int pointPeak = -1;
        int targetBased = summits[tryCount];
        int intensity = -1;

        while(!inArray(gates, pointPeak)) {
            int[] result = filter(targetBased, paths);

            if(result != null){
                targetBased = result[0];
                intensity = intensity < result[2] ? result[2] : intensity;
                pointPeak = result[0];
            }else {
                tryCount++;
                targetBased = summits[tryCount];
            }
        }

        int[] result = {summits[tryCount], intensity};
        return result;
    }
}


public class Main{
    public static void main(String[] args){
            Solution test = new Solution();
            int[][] paths = {{1,2,5}, {1,4,1}, {2,3,1},{2,6,7}, {4,5,1}, {5,6,1}, {6,7,1}};
            int[] gates = {3,7};
            int[] summits =  {1,5};
            int n = 7;

            test.solution(n,paths, gates, summits);
    }
}
