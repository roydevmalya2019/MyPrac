import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]){
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Rectangle\n2. Square\n3. Circle\nArea Calculator --- Choose your shape");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("Enter length and breadth:");
                    int l = sc.nextInt();
                    int b = sc.nextInt();
                    Rectangle R = new Rectangle(l,b);
                    System.out.print("Area of Rectangle is:");
                    System.out.printf("%.2f",R.calculateArea());
                    System.out.println();
                    break;
            case 2: System.out.println("Enter side:");
                    int s = sc.nextInt();
                    Square S = new Square(s);
                    System.out.print("Area of Square is:");
                    System.out.printf("%.2f",S.calculateArea());
                    System.out.println();
                    break;
            case 3: System.out.println("Enter Radius:");
                    int r = sc.nextInt();
                    Circle C = new Circle(r);
                    System.out.println("Area of Circle is:");
                    System.out.printf("%.2f",+C.calculateArea());
                    System.out.println();
                    break;
        }
    }
    
}