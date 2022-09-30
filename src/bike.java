abstract class bike {
   abstract void run();

}
class honda extends bike {
    void run()
    {
        System.out.println("running safily");
    }

    public static void main(String[] args) {
        bike b=new honda();
        b.run();
    }
}
