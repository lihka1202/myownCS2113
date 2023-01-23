public class PrintTotalScore {
    public static void printTotalScore(String[] values){
        // TODO: add your code here
        int sum =0;
        for(int i = 0; i< values.length;i+=1) {
            sum += Integer.parseInt(values[i]);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        printTotalScore(new String[]{});
        printTotalScore(new String[]{"0", "124", "-15"});
    }
}
