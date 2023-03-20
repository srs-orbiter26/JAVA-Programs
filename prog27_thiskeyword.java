class Point_4{
    int x,y;

    Point_4(int x, int y){
        this.x=x;
        this.y=y;
    }

    void print(){
        System.out.println(x+" "+y);
    }
}

public class prog27_thiskeyword {
    public static void main(String[] args){
        Point_4 p1=new Point_4(10,20);
        Point_4 p2=new Point_4(5,15);
        p1.print();
        p2.print();
    }
}
