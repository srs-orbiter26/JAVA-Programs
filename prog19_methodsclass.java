class Point{
    int x;
    int y;
}

public class prog19_methodsclass {
    public static void main(String[] args){
        Point p=new Point();
        p.x=5;
        p.y=10;

        fun(p);

        System.out.println(p.x+" "+p.y);
    }

    public static void fun(Point p){
        p.x=10;
        p.y=10;
    }
}
