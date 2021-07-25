public class OddRange {
    static void Odd(int lowVal , int highVal)
    {
        if (highVal < lowVal)
        {
            System.out.print("Wrong Input");
        }
        for(int i=lowVal; i<=highVal; i++){ 
            int r = i%2; 
            if(r==1) 
                System.out.print(i + " ");
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
