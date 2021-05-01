public class Program1 {
    private Program1(){
        int a=10;
    }
    static int b=10;
    int c;
    public void print(){
        System.out.println(b);
    }
    public static void main(String []args){

        Program1 p=new Program1();
        p.print();
        p.b=20;
        Program1 p2=new Program1();

        System.out.println(p.b);
        System.out.println(p2.b);
        System.out.println("Inside main");
        String s="Neha";
        System.out.println("s value is "+ s);

        s="Prasad";
        System.out.println("s value is "+ s);
    }
    public static void main(String args){
        System.out.println("Inside main String args");
    }
    public static void main(int a){
        System.out.println("Inside main int a");
    }
}
