package com.polymorphism;

class bike {

        void run(){System.out.println("running");}
    }
     class Splendor extends bike{
        void run()
        {System.out.println("running safely with 60km");
        }

        public static void  main(String args[]){
            bike b = new Splendor();
            b.run();
        }
    }

