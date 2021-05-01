import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CandidateCode {
    public static void main(String args[] ) throws Exception {

        int presentStudents[]={1,2,3};
        ArrayList<Integer> missingStudent=new ArrayList<>();

        Map<Integer, Boolean> numberMap = new HashMap<>();

        int max = presentStudents.length;

        for (Integer i : presentStudents) {

            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            }
        }
        for (int i = 1; i <= max; i++) {
            if (numberMap.get(i) == null) {
                missingStudent.add(i);
            }
        }
        System.out.print("Missing Student=");
        for (int m:missingStudent){
            System.out.print(m+" ");
        }
    }
}
