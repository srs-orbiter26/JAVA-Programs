import java.util.*;

public class prog10_lastdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int last=n%10;
        System.out.println(last);
        sc.close();


    }
    
}
