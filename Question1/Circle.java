import java.util.*;
import java.io.*;
public class Circle extends Shape{
    private int radius;
    Circle(int radius){
        super("Circle");
        this.radius = radius;
        
    }
    double calculateArea(){
        return 3.1416*(double)(radius)*(double)(radius);
    }
}