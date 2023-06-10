import java.lang.*;
import java.util.*;
 
class Array3
{
   
   public static void main(String a[])
   {

    int iCnt =0,iEvenCnt =0,iOddCnt =0,iSize =0;

    Scanner sobj = new Scanner (System.in);

    System.out.println("Enter the size of array");
    iSize = sobj.nextInt();
    
    int Arr[] = new int [iSize];

    System.out.println("Enter the elements of an array");
    for(iCnt = 0; iCnt < Arr.length; iCnt++)
    {

    Arr[iCnt] = sobj.nextInt();

    }

    for(iCnt = 0; iCnt < Arr.length;iCnt++)
    {
        if((Arr[iCnt] % 2) == 0)
        {
            iEvenCnt++;
        }
        else
        {
            iOddCnt++;
        }

    
        
    }

    System.out.println("count of even elememts are"+iEvenCnt);
    System.out.println("count of odd elememts are"+iOddCnt);



   }
}