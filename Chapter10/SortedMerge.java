// Given two sorted arrays A and B, merge B into A in sorted order
public class SortedMerge {
    public static void main (String [] args) {
        int [] nums1 = {1, 2, 3, 0, 0, 0};
        int [] nums2 = {2, 5, 6};
        int m = 3;
        int n= 3;

        int index1 = m - 1;
        int index2 = n - 1;
        int length = nums1.length - 1;
        
        while (index2 >= 0) {
            if (index1 >= 0 && nums1 [index1] >= nums2 [index2]) {
                nums1 [length] = nums1 [index1];
                index1--;
            }
            
            else {
                nums1 [length] = nums2 [index2];
                index2--;
            }
            
            length--;
        }
    }
}
