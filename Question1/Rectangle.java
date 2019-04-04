import java.util.*;
import java.io.*;
public class Rectangle extends Shape{
    private int length;
    private int breadth;
    Rectangle(int length,int breadth)
    {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
        
    }
    double calculateArea(){
        return (double)length*(double)breadth;
    }
}