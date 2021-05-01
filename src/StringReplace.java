public class StringReplace {
    public String replaceString(String str){
        StringBuilder s=new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if(Character.isWhitespace(str.charAt(i))){
               s.setCharAt(i,'*');
            }
        }
        return s.toString();
    }
    public static void main(String[] args){

        StringReplace s =new StringReplace();
        String newString=s.replaceString("Hey how r u today?");
        System.out.println(newString);
    }
}
