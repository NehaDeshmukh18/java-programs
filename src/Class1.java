public class Class1 {
    public static void main(String args[]){
        int odd=1;
        String initial="ABCDEF", after="";
        after=initial=initial.replace("A","Z");

        System.out.println(initial + " "+ after);

        String s1="Neha";
        String s2="Neha";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
//
//        if(1){
//            System.out.println("Odd");
//        }
//        else{
//            System.out.println("Even");
//        }
    }
}
