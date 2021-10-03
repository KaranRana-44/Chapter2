package com.company;

public class Fraction {

    private int numerator;		//attributes
    private int denominator;

    // constructor
    public Fraction(int n, int d)	// constructor
    {
        numerator = n;
        denominator = d;

    }

    public Fraction()	// constructor
    {
        numerator = 1;
        denominator = 2;
    }

    public int getNum()
    {
        return numerator;
    }

    public int getDenom()
    {
        return denominator;
    }


    public Fraction add(Fraction other)
    {
        int n = this.numerator*other.denominator + this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }


    public Fraction subtract(Fraction other)	// constructor
    {
        int n = this.numerator*other.getDenom() - this.denominator*other.getNum();
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }


    public Fraction multiply(Fraction other)	// constructor
    {
        int n = this.numerator*other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }


    public String toString(){
        String s = numerator+ "/" + denominator;
        return s;

    }


    public Fraction reciprocal()	// constructor
    {
        int d = this.getNum();
        int n = this.getDenom();


        Fraction result = new Fraction(n,d);
        return result;
    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);	// create an instance of fraction
        Fraction f2 = new Fraction(4,5);

        System.out.println("f1 is :" + f1);
        System.out.println("f2 is :" + f2);


        Fraction f3 = f1.add(f2);			// add 2 fractions
        System.out.println(f1 + " + " + f2 + " = " + f3);	// print the answer


		Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);

        Fraction f5 = f1.multiply(f2);
        System.out.println(f1 + " x " + f2 + " = " + f5);

        Fraction f6 = f1.reciprocal();
        System.out.println("Reciprocal of f1 is:" + f6);

        Fraction f7 = f2.reciprocal();
        System.out.println("Reciprocal of f2 is:" + f7);

        Fraction f8 = new Fraction();	// created default fraction
        Fraction f9 = new Fraction(7,9);

        Fraction f10 = f8.add(f9);
        System.out.println(f8 + " + " + f9 + " = " + f10);
    }

}