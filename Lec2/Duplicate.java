import java.util.Arrays; 

public class Duplicate {
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

    public static void main(String[] args)
    {
        int[] arr1 = { 4 ,1,3,6,9};
 
        System.out.print("Output: ");
 
        int n[] = unique_array(arr1);
        if(arr1.length < 5){
            System.out.print("Array contains less than 5 elements"); 
        }else if(arr1.length == n.length){
            System.out.print("Array already unique"); 
        }else{
            for (int i = 0; i < n.length; i++) {  
                System.out.print(n[i] + " ");  
            } 
        }
    }
}
