import java.util.*;

public class AplusB {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        Fraction f = new Fraction(3,5);
        Fraction f1 = new Fraction(7);
        Fraction f2 = new Fraction();
        System.out.println(f);
        f.print();
        System.out.println(Fraction.count);
        System.out.println(Fraction.div(6,3));
    }
}