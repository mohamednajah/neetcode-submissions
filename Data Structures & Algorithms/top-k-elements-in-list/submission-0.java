class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i], hash.get(nums[i]) + 1);
            } else {
                hash.put(nums[i], 1);
            }
        }

        // frequency -> numbers with that frequency
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (int key : hash.keySet()) {
            int frequency = hash.get(key);

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(key);
        }

        int[] result = new int[k];
        int index = 0;

        for (int j = buckets.length - 1; j >= 1 && index < k; j--) {

            if (buckets[j] != null) {
                for (int d : buckets[j]) {
                    result[index] = d;
                    index++;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}