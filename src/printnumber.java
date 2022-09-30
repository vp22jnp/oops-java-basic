abstract class printnumber {
    protected static loops p;

    abstract void print();
}
class loops extends printnumber{
    void print(){
        int i;
        for (i=1;i<=10;i++)
        System.out.println(+i);
    }

    public static void main(String[] args) {
        printnumber.p= new loops();
        p.print();
    }
}