import java.util.*;

public class prog9_sumofnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till where you want to find the sum: ");
        int n=sc.nextInt();

        if(n<0){
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        else{
        int sum=(n*(n+1))/2;
        System.out.println(sum);
        }
        
        sc.close();
    }
    
}
