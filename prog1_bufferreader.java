//import java.math.*;
import java.io.*;
//import java.util.*;



public class prog1_bufferreader {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string: ");
        String s = br.readLine();
        System.out.println("You Entered " + s);

        System.out.println("Enter an Integer: ");
        int y = Integer.parseInt(br.readLine());
        System.out.println("You Entered "+ y);
    }
    
}
