import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
    public static void main(String[] args){

        Date today=new Date();
        Date nextDay=new Date(today.getTime()+(1000*60*60*24));
        SimpleDateFormat format=new SimpleDateFormat("dd-MMMM-yyyy");
        String date=format.format(nextDay);
        date=date.replace('-',' ');
        System.out.println(date);
    }
}
