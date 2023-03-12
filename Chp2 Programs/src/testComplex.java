class Complex{
    int real,img;

    Complex(){}

    Complex(int r, int i){
        this.real = r;
        this.img = i;
    }

    Complex(Complex c1, Complex c2){
        this.real = c1.real+c2.real;
        this.img = c1.img+c2.img;
    }

    Complex subtract(Complex c1, Complex c2){
        Complex s = new Complex(c1.real-c2.real,c1.img-c2.img);
        return s;
    }

    void print(){
        System.out.println(this.real+((this.img<0) ? "-" : "+")+Math.abs(this.img)+"i");
    }
}

public class testComplex {
    public static void main(String args[]){
        Complex c1 = new Complex(2,3);
        c1.print();
        Complex c2 = new Complex(4,6);
        c2.print();
        Complex sum = new Complex(c1,c2);
        sum.print();
        Complex c = new Complex();
        c.print();
        Complex diff = c.subtract(c1,c2);
        diff.print();
    }
}