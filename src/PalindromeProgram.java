public class PalindromeProgram {
    public static void main(String[] args){
        int r,sum=0, temp;
        int number=454;
        temp=number;
        while(number>0){
            r=number%10;
            sum=(sum*10)+r;
            number=number/10;
        }

        if(temp==sum){
            System.out.println(temp+" is Palindrome number");
        }
        else
        {
            System.out.println(temp+" is not Palindrome number");
        }
    }
}
