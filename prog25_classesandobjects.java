class Complex{
    int real;
    int img;

    void print(){
        System.out.println(real + "+" + img + "i");
    }

    Complex(int r, int i){
        real=r;
        img=i;
    }

    void add(Complex C){
        real+=C.real;
        img+=C.img;
    }
}

public class prog25_classesandobjects {
    public static void main(String[] args){
        Complex c1=new Complex(10,20);
        c1.print();
        Complex c2=new Complex(20,30);
        c1.add(c2);
        c1.print();
    }
}
