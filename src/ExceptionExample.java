public class ExceptionExample {
    public static void main(String []args){
        String s=new String("Neha");
        StringBuilder sb=new StringBuilder(s);
        try{
            System.out.println("inside try");
            System.exit(0);
        }
        catch (Exception e){
            System.out.println("inside catch");
        }
        finally {
            System.out.println("inside finally");
        }
    }
}
