public class StringReverseWithStringBuffer {
    public static void main(String[] args){

        String str="My name is neha";

        StringBuffer stringBuffer=new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
