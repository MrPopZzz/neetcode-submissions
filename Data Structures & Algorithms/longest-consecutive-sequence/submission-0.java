class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        for(int n : nums) {
            if(!set.contains(n - 1)) {
                int l = 1;

                while(set.contains(n + l)) {
                    l++;
                }

                maxLength = Math.max(maxLength, l);
            }
        }

        return maxLength;
    }
}
