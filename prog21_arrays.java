public class prog21_arrays {
    public static void main(String[] args){
        //int []a={1,2,3,4};
        int []a=new int[3];  // Initialization of an array
        int x=10;
        for(int i=0;i<a.length;i++){
            a[i]=x;
            x+=10;
        }
        System.out.println(a.length);
        System.out.println(a[1]);
    }
    

    
}

//arrays are references
// int []a and int a[] is same
// int []a,b;   ->Creates two arrays, a and b
// Arrays are objects and if we do not initialize them then automatically they store 0
// Primitives are stored in stack area and non-primitive are stored in heap area


