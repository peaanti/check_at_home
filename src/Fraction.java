public class Fraction {
    int a, b;
    static int count;
    static double div(double x, double y){
        return x/y;
    }

    public Fraction(int a, int b){
        this.a = a;
        this.b = b;
        count++;
    }

    public Fraction(int a){
        this.a = a;
        this.b = 1;
    }

    public Fraction(){
        b = 1;
    }
    public void print(){
        System.out.println(a + "/" + b);
        System.out.println(Fraction.count);
    }
}
