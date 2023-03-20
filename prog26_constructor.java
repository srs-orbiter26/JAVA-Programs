class Point_2{
    int x,y;

    Point_2(int a, int b){
        x=a;
        y=b;
    }

    void print(){
        System.out.println("x= "+ x +" y=" + y);
    }
}

public class prog26_constructor {
    public static void main(String[] args){
        Point_2 p=new Point_2(10,20);
        p.print();
    }
}


// If we do not write the code for the constructor, then the compiler automatically calls the default constructor where the members are initialized to 0

