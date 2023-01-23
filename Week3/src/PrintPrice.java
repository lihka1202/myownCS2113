public class PrintPrice {
    public static void printPrice(String item) {
        // TODO: add your code here
        item = item.trim();
        int dividerPosition = item.indexOf("--$");
        String lastPart = " " + item.substring(dividerPosition+3, item.length()).replace("/",".");
        System.out.println(item.substring(0,dividerPosition).toUpperCase().trim() + ":" + lastPart);
    }

    public static void main(String[] args) {
        printPrice("sandwich  --$4/50");
        printPrice("  soda --$10/00");
        printPrice("  fries --$0/50");
    }
}
