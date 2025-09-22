import java.util.*;
public class Pq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pencil: ");
        float pencilPrice = sc.nextFloat();
        System.out.println("Enter the price of pen: ");
        float penPrice = sc.nextFloat();
        System.out.println("Enter the price of eraser: ");
        float eraserPrice = sc.nextFloat();

        float total = pencilPrice + penPrice + eraserPrice;
        float gst = total * 0.18f;
        float totalPrice = total + gst;

        System.out.println("The total price of the items is: " + totalPrice);
    
}
}