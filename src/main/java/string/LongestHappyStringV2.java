package string;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class LongestHappyStringV2 {
    public static String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[0] - x[0]);
        String[] blocks = {"ab", "bb", "ba"};

        if (a > 0){
            pq.offer(new int[] {a, 0});
        }

        if (b > 0){
            pq.offer(new int[] {b, 1});
        }

        if (c > 0){
            pq.offer(new int[] {c, 2});
        }

        StringBuilder result = new StringBuilder();
        //Array to control elements to be added back to priority Queue
        List<int[]> elements = new ArrayList<>();

        while (!pq.isEmpty()){
            //Gets next element in priority queue
            int[] element = pq.poll();

            //Checks if element is valid according to the rules
            if (result.length() >= 2 &&
                    result.charAt(result.length() -1) == blocks[element[1]].charAt(0) &&
                    result.charAt(result.length() -2) == blocks[element[1]].charAt(0)){

                elements.add(element);
            } else {
                //Append characters and decrease counter
                result.append(blocks[element[1]]);
                element[0]--;

                //Offer back element if counter > 0
                if (element[0] > 0){
                    pq.offer(element);
                }

                //Add back elements taken out by validation
                for (int[] e : elements){
                    pq.offer(e);
                }

                elements.clear();
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int a = 3, b = 3, c = 3;
        String result = LongestHappyStringV2.longestDiverseString(a, b, c);
        System.out.println(result);
    }
}
