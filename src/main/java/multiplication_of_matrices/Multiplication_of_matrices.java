package multiplication_of_matrices;
import java.util.Scanner;


public class Multiplication_of_matrices {
    
    public static void multiply(int [][]a1,int [][]a2){
        int[][]arr1=a1;
        int [][]arr2=a2;
        
        int r1=arr1.length;
        int c1=arr1[0].length;
        
        int r2=arr2.length;
        int c2=arr2[0].length;
         int [][]result=  new int[r1][c2];
         
        if(c1==r2){
            
           for(int i=0;i<r1;i++){
               for (int j=0;j<c2;j++){
                   for(int k=0;k<c1;k++){
                       result[i][j]+=arr1[i][k]*arr2[k][j];
                   }
               }
           }
            
            
            System.out.println("the result is :");
         for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(result[i][j]+ " ");
                
            }
            System.out.println();
        }
           
        }else{
            System.out.println("ERROR .");
            System.out.println("hints : The number of column in first matrix must be equal to the nomber of rows in second metrix .");
        }
              
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
        System.out.println("Enter first arry's row number :");
        int row1=sc.nextInt();
        System.out.println("Enter first array's column number :");
        int column1=sc.nextInt();
int [][]arr1= new int[row1][column1] ; 

        System.out.println("Enter input of first array :");
        
        for(int i=0;i<row1;i++){
            for(int j=0;j<column1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        
             System.out.println("Enter second arry's row number :");
        int row2=sc.nextInt();
        System.out.println("Enter second array's column number :");
        int column2=sc.nextInt();
        
int [][]arr2= new int[row2][column2] ; 

        System.out.println("Enter input of second array :");
        
        for(int i=0;i<row2;i++){
            for(int j=0;j<column2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        
        multiply(arr1,arr2);
    }
}
