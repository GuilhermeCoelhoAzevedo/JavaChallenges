package neetCode250.ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://neetcode.io/problems/top-k-elements-in-list?list=blind75

public class TopKFrequentElements {
    /*
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int n : nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            arr.add(new int[] {entry.getKey(),entry.getValue()});
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        arr.sort((a, b) -> b[1] - a[1]);

        int[] res = new int[k];

        for (int i = 0; i < k; i++){
            res[i] = arr.get(i)[0];
        }

        return res;
    }
    */

    //Priority queue
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int n : nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            queue.offer(new int[] {entry.getKey(),entry.getValue()});

            if (queue.size() > k){
                queue.poll();
            }
        }

        int[] res = new int[k];

        for (int i = 0; i < k; i++){
            res[i] = queue.poll()[0];
        }

        return res;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        int k = 2;

        //int[] nums = {1,1,1,2,2,3};
        //int k=2;

        int[] result = TopKFrequentElements.topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));
    }
}
