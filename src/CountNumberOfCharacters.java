import java.util.HashMap;
import java.util.Map;

public class CountNumberOfCharacters {
    public static void main(String[] args){
        String str="My name is Neha";
        HashMap<Character, Integer> map=new HashMap<>();
        char[] arr=str.toCharArray();
        int len=arr.length;
        int count=0;

        for (int i = 0; i < len; i++) {
            if((str.charAt(i)!='\0')){
                count=count+1;
            }
        }

        System.out.println("The total number of character in "+str+"-"+count);
//        for (int i = 0; i < len-1; i++) {
//            if (map.containsKey(arr[i]))
//            {
//             map.put(arr[i],map.get(arr[i]+1));
//            }else
//            {
//                map.put(arr[i],1);
//            }
//        }
//        for (Map.Entry<Character,Integer> m:map.entrySet()) {
//            System.out.println(m.getKey()+" "+m.getValue());
//        }

    }

}
