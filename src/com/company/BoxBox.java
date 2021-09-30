package com.company;

public class BoxBox {
    //class attributes//
    private double height;
    private double width;
    private double length;
    private String color;
    private boolean hasALid;

    public BoxBox(double h, double w, double l, String c, boolean lid){
        height=h;
        width=w;
        length=l;
        color=c;
        hasALid=lid;
    }
    public BoxBox(double h, double w, double l) {
        height = h;
        width = w;
        length = l;
        color = "white";
        hasALid = true;
    }
    public BoxBox(){    // default constructor
        height=1.0;
        width=1.0;
        length=1.0;
        color="white";
        hasALid=false;
    }
    // accessor methods

    public void setHeight (double h){
        height=h;
    }

    public double getHeight(){
        return height;
    }

    public static void main(String[] args) {
        BoxBox b1 = new BoxBox(5.4,3.9,6.9,"red",false);
        BoxBox b2 = new BoxBox(4.5, 3.7, 7.8);
        BoxBox b3 = new BoxBox();

        System.out.println(b1.getHeight());
        b1.setHeight(9.9);
        System.out.println(b1.getHeight());


    }
}
