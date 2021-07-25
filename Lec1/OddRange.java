public class OddRange {
    static void Odd(int lowVal , int highVal)
    {
        if (highVal < lowVal)
        {
            return;
        }
        if(highVal % 2 == 1 )
            Odd(lowVal, highVal - 2);
        else
            Odd(lowVal, highVal - 1);
        if (highVal % 2 == 1)
        {
            System.out.print(highVal + " ");
        }
    }
    public static void main(String[] args)
    {
        int lowVal = 12; 
        int highVal = 23;
        System.out.println();
        
        System.out.print("Starting Value:" + lowVal);
        System.out.println(); 
        System.out.print("Ending Value:" + highVal);
        System.out.println(); 
        System.out.println(); 
        Odd(lowVal, highVal);
    }
}
