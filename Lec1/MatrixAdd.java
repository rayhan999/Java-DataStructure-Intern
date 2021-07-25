public class MatrixAdd {
    
    public static void main(String args[])
    {    
        int a[][]={{12,13,14},{15,16,17},{18,19,20}};    
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int c[][]={{101,104,107},{102,105,108},{103,106,109}};       
        int d[][]=new int[3][3];

        System.out.println();   
        for(int i=0;i<3;i++)
        {    
            for(int j=0;j<3;j++)
            {    
                d[i][j]=a[i][j]+b[i][j]+c[i][j];  
                System.out.print(d[i][j]+" ");    
            }    
            System.out.println();   
        }    
    }
}
