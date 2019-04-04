import java.util.*;
import java.io.*;
public class Square extends Shape{
    private int side;
    Square(int side){
        super("Square");
        this.side = side;
        
    }
    double calculateArea(){
       return (double)side*(double)side; 
    }
}