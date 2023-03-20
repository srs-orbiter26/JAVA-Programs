public class prog18_mathodsparameters {
    public static void main(String[] args){
        int x=5;
        int y=10;

        int max=getMax(x,y);
        System.out.println(max);
    }
    public static int getMax(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    
}
