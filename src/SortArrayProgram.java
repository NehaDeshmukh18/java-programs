public class SortArrayProgram {
    public static void main(String[] args){

        int[] arr=new int[]{55,22,88,77,11};
        int temp=0;

        System.out.println("Elements of original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        //sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
