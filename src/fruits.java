abstract class fruits {
    abstract void eat();
}
class apple extends fruits {
    void eat() {
        System.out.println("eat apples");
    }

    //class mango extends apple {
       // void eat() {
         //   System.out.println("eat mango with apple");
       // }

        public static void main(String[] args) {
            fruits f = new apple();
            f.eat();
        }
    }




