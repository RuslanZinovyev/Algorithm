package hash;

import java.util.HashMap;

public class HashMapAlgorithm {

    public static void main(String[] args) {
        displayFrequencyElement(new int[] {1, 2, 2, 2, 6, 6, 7});
    }

    public static void displayFrequencyElement(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int x : arr) {
            if (!freqMap.containsKey(x)) {
                freqMap.put(x, 1);
            } else {
                freqMap.put(x, freqMap.get(x) + 1);
            }
        }
        freqMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }

}
