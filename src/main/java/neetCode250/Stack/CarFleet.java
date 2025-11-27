package neetCode250.Stack;

import java.util.Arrays;

public class CarFleet {
    public static int carFleet(int target, int[] position, int[] speed) {
        int[][] highway = new int[position.length][2];

        //Creating array with concatenated data
        for (int i = 0; i < position.length; i++){
            highway[i][0] = position[i];
            highway[i][1] = speed[i];
        }

        //Sorting array by position
        Arrays.sort(highway, (a, b) -> b[0] - a[0]);

        double prevTime  = (double) (target - highway[0][0]) / highway[0][1];
        int carFleet = 1;

        //Checking carFleets
        for (int i = 1; i < highway.length; i++){
            double currTime  = (double) (target - highway[i][0]) / highway[i][1];

            if (currTime > prevTime){
                carFleet++;
                prevTime = currTime;
            }
        }

        return carFleet;
    }

    public static void main(String[] args) {
        /*
        int target = 10;
        int[] position = {1,4};
        int[] speed = {3,2};
        */

        int target = 10;
        int[] position = {4, 1, 0, 7};
        int[] speed = {2, 2, 1, 1};

        int result = CarFleet.carFleet(target, position, speed);
        System.out.println(result);
    }
}
