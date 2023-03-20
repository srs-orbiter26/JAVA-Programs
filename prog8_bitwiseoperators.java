public class prog8_bitwiseoperators {
    public static void main(String[] args){
        int x=3;
        int y=6;
        int z=-1;
        int a=10;
        int b=-2;

        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(x^y);
        System.out.println(~x);
        System.out.println(x<<1);
        System.out.println(x<<2);
        System.out.println(z<<1);
        System.out.println(a>>1);
        System.out.println(b>>1);
        System.out.println(b>>>1);  // Unsigned Right Shift
        
    }
    
}
