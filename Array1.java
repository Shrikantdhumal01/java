import java.lang.*;
import java.util.*;

class Array1
{

    public static void main(String a[])
    {
        int iCnt  = 0;  float iSum = 0; float Avg = 0;

        Scanner sobj =  new Scanner(System.in);
        
        System.out.println("Enter size of array");
        int iSize  = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements of array");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

           

        for(iCnt = 0; iCnt <= Arr.length-1; iCnt++)
        {
        iSum = iSum +Arr[iCnt];

           Avg = (iSum / Arr.length);
        

        }
     
        


    

          

        System.out.println("Average is: "+Avg
        );




    }

}