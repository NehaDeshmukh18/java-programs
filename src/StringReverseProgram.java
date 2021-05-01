public class StringReverseProgram {
    public static void main(String[] args){
        String s="My name is Neha";
        String revString=new String();
        for (int i = s.length()-1; i >=0 ; i--) {
            revString=revString+s.charAt(i);
        }
        System.out.println("String is= "+s);
        System.out.println("Reverse string is= "+revString);
    }
}
