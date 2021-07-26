import java.util.Arrays;
public class MergeArray{
    public static void main(String[] args) {
        
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8};

       int[] mergeArray = merge(array1, array2);
       System.out.println();  
        System.out.print("Output: ");  
        for (int i = mergeArray.length-1; i >= 0; i--) {  
            System.out.print(mergeArray[i] + " ");  
        }
    }

    

    public static int[] merge(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(a, 0, result, 0, aLen);
        System.arraycopy(b, 0, result, aLen, bLen);

       return result;
    }
}