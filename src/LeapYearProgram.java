public class LeapYearProgram {
    public static void main(String[] args){

        //if year is divisible by 400 then is_leap_year
        //else if year is divisible by 100 then not_leap_year
        //else if year is divisible by 4 then is_leap_year
        //else not_leap_year

        int year=2016;

        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println(year+" is Leap Year");
        }else {
            System.out.println(year+"is Not a Leap Year");
        }
    }
}
