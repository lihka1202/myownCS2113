import java.util.Arrays;

public class FilterEmails {
    public static String[] filterEmails(String[] items){
        // TODO: add your code here
        String[] email = new String[items.length];
        int currentIndex = 0;
        for(int i = 0; i< items.length;i+=1) {
            if(items[i].contains("@")) {
                email[currentIndex] = items[i];
                currentIndex+=1;
            }
        }
        return Arrays.copyOf(email,currentIndex);
    }

    public static void printItems(String[] items){
        // TODO: add your code here
        System.out.println(Arrays.toString(items));
    }

    public static void main(String[] args) {
        printItems(filterEmails(new String[]{}));
        printItems(filterEmails(new String[]{"abc"}));
        printItems(filterEmails(new String[]{"adam@example.com", "aab", "john@example.com", "some@"}));
        printItems(filterEmails(new String[]{"xyz", "@bee.com", "aab"}));
    }
}
