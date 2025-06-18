public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;
//        System.out.println("Input String: " + java.util.Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                // System.out.println("Unique element found: " + nums[uniqueIndex] + " at index " + uniqueIndex);
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1; // Return the count of unique elements
    }

    // Alternative method using HashSet (not in-place, but demonstrates another approach)
    public int removeDuplicatesWithHashSet(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        int index = 0;
        for (int num : nums) {
            if (set.add(num)) { // Only add if not already present
                nums[index++] = num;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1, 1, 2, 3, 3, 4};
        int uniqueCount = solution.removeDuplicates(nums);
        System.out.println("Number of unique elements: " + uniqueCount);
        System.out.print("Unique elements: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
