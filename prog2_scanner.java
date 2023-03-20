//import java.math.*;
//import java.io.*;
import java.util.*;


public class prog2_scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("You Entered String: "+s);
        int x=sc.nextInt();
        System.out.println("You entered Integer: "+x);
        float f=sc.nextFloat();
        System.out.println("You Entered Float: "+f);

        sc.close();
    }
}
