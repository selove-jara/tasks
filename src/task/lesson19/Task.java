package task.lesson19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 6, 8, 9, 13, 20));
        List<Integer> result = removeEven(list);
        System.out.println(result);
    }

    private static List<Integer> removeEven(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : list) {
            if (value % 2 != 0) {
                result.add(value);
            }
        }
        return result;
    }
}
