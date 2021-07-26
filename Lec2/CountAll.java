import java.util.Arrays;

public class CountAll {
    public static void main(String args[]){
        int[] arr1 = { 4 ,1,3,6,9,1,5,6,1,1};
        int n[] = unique_array(arr1);
        for( int i=0; i<n.length; i++){
            int count = search(arr1, arr1[i]);
            System.out.printf("%d occurs = %d times." , n[i], count);
            System.out.println();
        }
       
        
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

   static int[] unique_array(int[] my_array)
    {
        int uniqueValue = my_array.length;
        for (int i = 0; i < uniqueValue; i++) 
        {
            for (int j = i+1; j < uniqueValue; j++)
            {
                if(my_array[i] == my_array[j])
                {
                    my_array[j] = my_array[uniqueValue-1];
                    uniqueValue--;
                    j--;
                }
            }
        }
        int[] array1 = Arrays.copyOf(my_array, uniqueValue);
        return array1;
    }
}
