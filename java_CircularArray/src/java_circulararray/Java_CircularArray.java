
package java_circulararray;

import java.util.*;
public class Java_CircularArray {

    public static void main(String[] args) {
        
        CircularArrayADT arrayprint= new CircularArrayADT();
       
        char[] circularArray = {'A','B','C','D','E','F'};
       
        int size= 6;
     
        arrayprint.print(circularArray, 4, size);
        
    }  
}
