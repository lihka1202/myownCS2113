import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Main {

    //TODO: add your methods here
    private static ArrayList<Integer> numbers = new ArrayList<>();

    private static void addNumber(int i) {
        numbers.add(Integer.valueOf(i));
        System.out.println(numbers);
    }
    private static int getTotal() {
        int sum = 0;
        for(int element : numbers) {
            sum+=element;
        }
        return sum;
    }
    private static boolean isFound(int number) {
        boolean isPresent = false;
        for(int element : numbers) {
            if(element== number) {
                return true;
            }
        }
        return false;
    }

    private static void removeNumber(Integer  number) {
        numbers.remove(number);
        System.out.println(numbers);
    }
//    public static void main(String[] args) {
//        System.out.println("Adding numbers to the list");
//        addNumber(3);
//        addNumber(8);
//        addNumber(24);
//        System.out.println("The total is: " + getTotal());
//        System.out.println("8 in the list : " + isFound(8) );
//        System.out.println("5 in the list : " + isFound(5) );
//        removeNumber(8);
//        System.out.println("The total is: " + getTotal());
//    }

    private static HashMap<String, Integer> roster = new HashMap<>();
    private static void addToRoster(String K) {
        roster.computeIfPresent(K, (k,v) -> v+1);
        roster.computeIfAbsent(K, k -> 1);
    }

    private static void printRoster() {
        for (Map.Entry<String, Integer> entry : roster.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        addToRoster("Monday"); // i.e., one person signed up for Monday
        addToRoster("Wednesday"); // i.e., one person signed up for Wednesday
        addToRoster("Wednesday"); // i.e., another person signed up for Wednesday
        addToRoster("Friday");
        addToRoster("Monday");
        printRoster();
    }

}