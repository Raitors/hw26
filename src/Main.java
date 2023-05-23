import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        task();
        task2();
        task3();
        task4();
    }

    static void task() {
        for (int num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println();
    }

    static void task2() {
        Set<Integer> set = new HashSet<>(nums);
        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println();
    }

    static void task3() {
        Set<String> string = new HashSet<>(strings);
        System.out.println(string);
        System.out.println();
    }

    static void task4() {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                Integer count = map.get(string) + 1;
                map.put(string, count);
            } else {
                map.put(string, 1);
            }
        }
        System.out.println(map.values());

    }

}


