package com.polymorphism;

 class fruits {
     void eat(){
         System.out.println("eating......");
     }
     static class apple extends fruits{
         void eat()
         {
             System.out.println("not eating....");
         }

         public static void main(String[] args) {
             fruits m =new apple();
             m.eat();
         }
     }
}
