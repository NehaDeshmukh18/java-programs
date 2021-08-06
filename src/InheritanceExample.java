public class InheritanceExample {

    public class A
    {
        public void A(){
            System.out.println("Inside A class constructor");
        }
        public void test(){
            System.out.println("Inside method test of class A");
        }
        public void c(){
            System.out.println("Inside method c");
        }
    }
    public class B extends A
    {
        public void B(){
            System.out.println("Inside B class constructor");
        }
        public void test(){
            super.test();
            System.out.println("Inside method test of class B");
            c();
        }
    }

    public static void main(){
    }

}
