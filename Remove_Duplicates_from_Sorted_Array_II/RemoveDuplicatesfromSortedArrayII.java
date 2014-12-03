public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length <= 2) {
            return A.length;
        }
        int insert = 2;
        for (int i=2; i<A.length ; i++ ) {
            if (A[i] != A[insert-2]) {
                A[insert] = A[i];
                insert++;
            }
        }
        return insert;
    }
}