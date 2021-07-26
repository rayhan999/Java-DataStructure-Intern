import java.util.Scanner;

public class SearchCount {
    public static void main(String args[]){
        int[] arr1 = { 4 ,1,3,6,9,1,1,1};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number to search:");
        int num = scanner.nextInt();
        int count = search(arr1, num);
        System.out.printf("The number occurs %d times in the array." , count);
   }

   public static int search(int[] arr,int num)
   {
       int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==num){
                count++;
            }
        }
        return count;
   }
}
