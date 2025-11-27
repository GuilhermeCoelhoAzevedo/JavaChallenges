package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    // Problem
    public static void separate(ArrayList<Integer> a, ArrayList<Integer> b){
        Set<Integer> onlyA = new HashSet<>(a);
        Set<Integer> onlyB = new HashSet<>(b);
        Set<Integer> common = new HashSet<>(a);


        common.retainAll(b);
        onlyA.removeAll(b);
        onlyB.removeAll(a);

        System.out.println(onlyA);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
        CommonElements.separate(a, b);
    }

    public void riskyMethod() throws Exception{
        throw new Exception();
    }
}

