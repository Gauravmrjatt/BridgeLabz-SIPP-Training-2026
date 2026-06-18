class LeetcodeProblems {
    public int sqrt(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        if (x == 0 || x == 1) {
            return x;
        }
        int left = 1, right = x / 2, result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                result = mid;
                left = mid + 1;
            }
        }
        return result;
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        return uniqueIndex + 1;
    }

    public int maxProfit(int[] prices) {
        if (prices == null) {
            throw new IllegalArgumentException("Prices array cannot be null");
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public String addBinary(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Input strings cannot be null");
        }
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            carry = sum / 2;
            result.append(sum % 2);
        }
        return result.reverse().toString();
    }

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        LeetcodeProblems leetcode = new LeetcodeProblems();

        System.out.println("Sqrt(16): " + leetcode.sqrt(16));
        System.out.println("Sqrt(8): " + leetcode.sqrt(8));

        int[] nums = {1, 1, 2, 2, 3};
        System.out.println("Unique count after removal: " + leetcode.removeDuplicates(nums));

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit: " + leetcode.maxProfit(prices));

        System.out.println("Binary sum (101 + 110): " + leetcode.addBinary("101", "110"));

        int[] sorted = {1, 3, 5, 6};
        System.out.println("Insert position for 2: " + leetcode.searchInsert(sorted, 2));
    }
}