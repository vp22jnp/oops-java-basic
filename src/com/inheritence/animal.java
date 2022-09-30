package com.inheritence;

 class animal {
        void eat(){System.out.println("eating...");}
    }
    class Dog extends animal{
        void bark(){System.out.println("barking...");}
    }
    class BabyDog extends Dog{
        void weep(){System.out.println("weeping...");}
    }
    class TestInheritance{
        public static void main(String args[]){
            BabyDog d=new BabyDog();
            d.weep();
            d.bark();
            d.eat();
        }}

