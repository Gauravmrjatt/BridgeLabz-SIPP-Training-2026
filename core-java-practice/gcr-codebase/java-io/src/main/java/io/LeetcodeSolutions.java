package io;

import java.util.ArrayList;
import java.util.List;

public class LeetcodeSolutions {
    public static int findFirstOccurrence(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    
    public static int numGoodPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) count++;
            }
        }
        return count;
    }
    
    public static String simplifyPath(String path) {
        String[] parts = path.split("/");
        List<String> stack = new ArrayList<>();
        
        for (String part : parts) {
            if (part.equals(".") || part.isEmpty()) continue;
            if (part.equals("..")) {
                if (!stack.isEmpty()) stack.remove(stack.size() - 1);
            } else {
                stack.add(part);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }
        return result.length() == 0 ? "/" : result.toString();
    }
    
    public static int numberOf1Bits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    
    public static double thirdMaxNumber(double[] nums) {
        double first = Double.NEGATIVE_INFINITY, second = Double.NEGATIVE_INFINITY, third = Double.NEGATIVE_INFINITY;
        
        for (double num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num > third && num < second) {
                third = num;
            }
        }
        return third == Double.NEGATIVE_INFINITY ? first : third;
    }
    
    public static String sortCharsByFrequency(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            for (int j = 0; j < freq[i]; j++) {
                result.append(c);
            }
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println("LeetCode Solutions implemented");
    }
}