public class Solution {
    public int removeDuplicates(int[] A) {
        int len = A.length;
        if (len == 0) {
            return 0;
        }
        int insert = 1;
        for (int i=1; i<len ; i++ ) {
            if (A[i] != A[i-1]) {
                A[insert] A[i];
                insert++;
            }
        }
        return insert;
    }
}