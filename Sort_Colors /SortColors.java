public class Solution {
    public void sortColors(int[] A) {
        int zero = 0;
        int two = A.length - 1;
        int tmp;
        for (int i=0; i<A.length ; i++) {
            while(A[i] == 2 && i < two){
                tmp = A[two];
                A[two] = A[i];
                A[i] = tmp;
                two--;
            }
            while(A[i] == 0 && i > zero){
                tmp = A[zero];
                A[zero] = A[i];
                A[i] = tmp;
                zero++;
            }
        }
    }
}