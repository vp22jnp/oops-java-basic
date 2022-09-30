package com.inheritence;

 class fruits {
     protected static apple obj;
     float price=50;
}
class apple extends fruits {
    int price = 80;


    public static void main(String[] args) {
               fruits .obj=new apple();
        System.out.println("rate of fruit is-" +obj.price);
        System.out.println("rate of apple is-" +obj.price);
    }
}