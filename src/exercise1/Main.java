package exercise1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] mass = new Integer[100];
        int count = 1;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = count;
            count++;
            }
            Set<Integer> integerSet = Arrays.stream(mass).collect(Collectors.toCollection(HashSet::new));
        if (count % 2 != 0) {
            System.out.println(integerSet);
        }
    }
}
