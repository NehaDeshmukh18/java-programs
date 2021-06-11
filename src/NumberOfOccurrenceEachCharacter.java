import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurrenceEachCharacter {
    //program to find the character occurences in a string

    public static void main(String []args){
        String str="my name is Neha and I am automation tester";
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();

        char[] arr=str.toCharArray();
        int length=arr.length;

        for (int i=0;i<length-1;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Character,Integer> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
