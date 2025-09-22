import java.util.*;
public class PQ1 {
    public static void main(String args[]) {
        ComplexNum c = new ComplexNum();
        c.sum();

    }
    
}

class ComplexNum {

    public void sum () {
        System.out.println("Enter the real part of num1");
        Scanner sc = new Scanner (System.in);
        int real1=sc.nextInt();
        System.out.println("Enter the imaginary part of num1");
        int img1=sc.nextInt();
        System.out.println("Enter the real part of num2");
        int real2=sc.nextInt();
        System.out.println("Enter the imaginary part of num2");
        int img2=sc.nextInt();
        int sumreal=real1+real2;
        int sumimg=img1+img2;

        System.out.println("Sum :-"+sumreal+"+i"+sumimg);


    }

    public void diff () {
        System.out.println("Enter the real part of num1");
        Scanner sc = new Scanner (System.in);
        int real1=sc.nextInt();
        System.out.println("Enter the imaginary part of num1");
        int img1=sc.nextInt();
        System.out.println("Enter the real part of num2");
        int real2=sc.nextInt();
        System.out.println("Enter the imaginary part of num2");
        int img2=sc.nextInt();

        System.out.println("difference :-"+(real1-real2)+"+i"+(img1-img2));


    }

    public void product () {
        System.out.println("Enter the real part of num1");
        Scanner sc = new Scanner (System.in);
        int real1=sc.nextInt();
        System.out.println("Enter the imaginary part of num1");
        int img1=sc.nextInt();
        System.out.println("Enter the real part of num2");
        int real2=sc.nextInt();
        System.out.println("Enter the imaginary part of num2");
        int img2=sc.nextInt();

        System.out.println("Product :-"+real1*real2+"+i"+img1*img2);


    }
}
