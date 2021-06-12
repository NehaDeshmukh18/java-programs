import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args){
        //check whether two strings having same set of characters or not

        String String1="Mother In Law";
        String String2="Hitler Woman";

        boolean isEqual=true;

        String str1=String1.replaceAll("\\s","").toLowerCase();
        String str2=String2.replaceAll("\\s","").toLowerCase();

        if(str1.length()!=str2.length()){
            isEqual=false;
        }else {
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();
            System.out.println(String.valueOf(arr1)+" "+String.valueOf(arr2));

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            System.out.println(String.valueOf(arr1)+ " "+String.valueOf(arr2));

            for (int i=0;i<arr1.length-1;i++){
                if(arr1[i] != arr2[i]){
                    isEqual=false;
                }
            }
            if(!isEqual){
                System.out.println("Not Equal");
            }
            else {
                System.out.println("Equal");
            }

        }
    }
}
