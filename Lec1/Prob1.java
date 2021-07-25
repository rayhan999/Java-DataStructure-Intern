public class Prob1 {  
    public static void main(String[] args) {  
        int [] arr = new int [] {12,32,43,1,54,53,15,64,3,13};  
        System.out.println("Input: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Output: ");  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  