import java.util.Arrays; 

public class CommonInArray {
    private static void FindCommonElemet(int[] array1, int[] array2)
    {
        boolean hasCommon = false;
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                    hasCommon = true;
                    System.out.print(array1[i] + " ");
                }
            }
        } 
        if(hasCommon == false){
            System.out.println("No Common Element!");
        }  
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

    public static void main(String[] args)
    {
        int[] arr1 = { 4 ,1,3,6,9,6,9};
        int[] arr2 = { 5,3,7,1,2,6 };
 
        System.out.print("Output: ");
 
        int n[] = unique_array(arr1);
        FindCommonElemet(n, arr2);
    }
}
