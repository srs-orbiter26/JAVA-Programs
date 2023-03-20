public class prog23_arrays_2d {
    public static void main(String[] args){
        int m=2;
        int n=3;

        int arr[][]=new int[m][n];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
