public class prog15_continue {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            if(i==1 || i==2){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
