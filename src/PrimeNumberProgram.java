public class PrimeNumberProgram {
    public static void main(String[] args){

        int num=11;
        boolean flag=false;

        for (int i = 2; i < num; i++) {
            if (num%i==0){
                flag=true;
                break;
            }
        }
        if (!flag)
        {
            System.out.println(num+" is Prime number");
        }else{
            System.out.println(num+" is not Prime");
        }
    }
}