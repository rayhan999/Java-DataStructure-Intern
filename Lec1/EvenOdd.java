import java.util.*; 

public class EvenOdd {
    public static void main(String[] args)
    {
       int[] nums = {12,32,43,1,54,53,15,64,3,13};
       int even = 0, odd = 0;
           
       for(int i = 0; i < nums.length; i++) {
           if(nums[i] % 2 == 0)
           {         
             even++;
           }
           else
              odd++;	
       }  
       System.out.println();                
       System.out.print(odd + " Odd Numbers ");
       System.out.println(); 
       System.out.print(even + " Even Numbers ");
     }
   }