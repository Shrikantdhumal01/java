import java.lang.*;
import java.util.*;

class Array2
{ 
    
    public static void main (String a[])
   {   
    int iCnt =0 ; int iSize = 0; int iEvenCnt =0;

    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter the size of an array");
    iSize = sobj.nextInt();

    int Arr[] = new int[iSize];

    System.out.println("Enter the elements in an array");
    for(iCnt = 0; iCnt < Arr.length; iCnt++)
    {
        Arr[iCnt] = sobj.nextInt();
    }

    for(iCnt = 0; iCnt < Arr.length-1;iCnt++)
    {
        if((Arr[iCnt] % 2) == 0)
        {
            iEvenCnt++;
        }
    }

    System.out.println("Even Count is "+iEvenCnt);


}

}

