import java.util.Scanner;
class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(){
        denominator = 1;
    }

    public Fraction(int numerator){
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction add(Fraction f){
        int temp;
        temp=this.getDenominator();
        this.numerator*=f.denominator;
        this.denominator*=f.denominator;
        f.denominator*=temp;
        f.numerator*=temp;
        this.numerator+=f.numerator;
        this.simplify();
        return this;
    }

    public Fraction subtract(Fraction f){
        int temp;
        temp=this.getDenominator();
        this.numerator*=f.denominator;
        this.denominator*=f.denominator;
        f.denominator*=temp;
        f.numerator*=temp;
        this.numerator-=f.numerator;
        this.simplify();
        return this;
    }

    public Fraction divide(Fraction f){
        this.numerator*=f.denominator;
        this.denominator*=f.numerator;
        this.simplify();
        return this;
    }

    public Fraction simplify(){

        int small;
        if(this.numerator>this.denominator)
            small=this.denominator;
        else
            small=this.numerator;

        while (small>1) {
            if (this.numerator % small == 0 && this.denominator % small == 0) {
                this.numerator /= small;
                this.denominator /= small;
            } else
                small--;
        }
        return this;
    }

    public Fraction multiply(Fraction f){
        this.numerator *= f.numerator;
        this.denominator *= f.denominator;
        this.simplify();
        return this;
    }

    void print(){
        System.out.println(this.numerator + "/" + this.denominator);
    }
}

