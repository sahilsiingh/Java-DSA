public class medianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Check if both arrays are null or empty
        if (nums1 == null && nums2 == null) {
            return 0; // or throw an exception
        }

        // If one of the arrays is null, handle it
        if (nums1 == null || nums1.length == 0) {
            return findMedian(nums2);
        }
        if (nums2 == null || nums2.length == 0) {
            return findMedian(nums1);
        }

        // Merge the two sorted arrays
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Copy remaining elements
        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }

        // Calculate the median
        return findMedian(merged);
    }

    public static double findMedian(int[] nums) {
        int n = nums.length;
        if (n % 2 == 0) {
            return (nums[n / 2 - 1] + nums[n / 2]) / 2.0;
        } else {
            return nums[n / 2];
        }
    }


    
    public static void main(String[] args) {

        int [] nums1 = {};
        int [] nums2 = {4,5,6};

        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
}