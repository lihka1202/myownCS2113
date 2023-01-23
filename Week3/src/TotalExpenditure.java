import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class TotalExpenditure {
    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("Your expenses while overseas?");
        // TODO: add your code here
        line = in.nextLine();
        String[] words = line.split(" ");
        String[] costs = new String[words.length];

        int currentIndex = 0;
        for(int i = 0; i<words.length;i+=1) {
            if(words[i].contains("$")){
                costs[currentIndex] = words[i];
                ++currentIndex;
            }
        }
        costs = Arrays.copyOf(costs, currentIndex);
        System.out.print("Expenses in overseas currency:" + Arrays.toString(costs));
        double sum = 0;
        for(int i = 0; i<costs.length;i+=1){
            sum+= Double.parseDouble(costs[i].substring(1, costs[i].length()));
        }
        String finalAmount = Double.toString(sum * 1.7);
        finalAmount = String.format("%.2f",sum*1.7);
        System.out.print("Total in local currency: " +"$"+ finalAmount);
    }
}
