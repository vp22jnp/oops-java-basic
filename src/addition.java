abstract class addition {
    protected static add obj;

    abstract void calculation();
}
class add extends addition{
    void calculation(){
        int a=2;
        int b=5;
        int sum=a+b;
        System.out.println("sum "+sum);
    }

    public static void main(String[] args) {
        addition.obj =new add();
        obj.calculation();
    }
}
