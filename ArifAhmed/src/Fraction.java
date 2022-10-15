
import java.util.Scanner;

public class Fraction {
    private int num; //numerator
    private int denom; //denominator 
    
    public Fraction() {
        super();
    }

    public Fraction(int num, int denom) {
        super();
        this.num = num;
        this.denom = denom;
        if (denom == 0) {
             this.denom = 1;
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDenom() {
        return denom;
    }

    public void setDenom(int denom) {
        if (denom > 0) {this.denom = denom;}
    }

    public void inputFraction() {
        Scanner innum = new Scanner(System.in);
        System.out.println("Input numerator: ");
        num = innum.nextInt();
        
        Scanner indenom = new Scanner(System.in);
        System.out.println("Input denominator: ");
        denom = indenom.nextInt();
        
    }
    
    public String toString() {
        return num + "/" + denom;
    }
    
    //addition
    public Fraction add(Fraction f2) {
        int num2 = f2.getNum();
        int denom2 = f2.getDenom();
        int num3 = (num * denom2) + (num2 * denom);
        int denom3 = denom * denom2;
        Fraction f3 = new Fraction(num3, denom3);
        f3.inputFraction();
        return f3;
    }
}
