public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        while(m+n > 0){
            if (m == 0) {
                A[m+n-1] = B[n-1];
                n--;
            } else if (n == 0) {
                return;
            } else if (A[m-1] >= B[n-1]) {
                A[m+n-1] = A[m-1];
                m--;
            } else {
                A[m+n-1] = B[n-1];
                n--;
            }
        }
    }
}