public class Factorial {
    int number;
    public static void findFactorial(int number){
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+"= "+fact);

    }
    public static void main(String args[]){
        String s=new String("Hello");
        String s2=new String("Hello");

        if(s==s2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        findFactorial(5);

    }
}
