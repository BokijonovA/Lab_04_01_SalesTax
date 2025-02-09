public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        int price = 10;
        double taxRate = 0.05;
        double tax = price * taxRate;
        double total = price + tax;
        System.out.println("The total price would be " + total);
    }

}