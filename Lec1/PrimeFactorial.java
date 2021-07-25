import java.util.Scanner;
class PrimeFactorial{
   public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = scanner.nextInt();
        String factorial;
        if(!primeCheck(num))
        {
             factorial = ""+fact(num);
            
        }else{
             factorial = "Error! Not a Prime Number";
        }
        System.out.println("Output:"+factorial);
   }
   public static int fact(int num)
   {
       int output;
       if(num==1){
         return 1;
       }
       output = fact(num-1)* num;
       return output;
   }

   public static boolean primeCheck(int num)
   {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
   }
}