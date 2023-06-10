import java.lang.*;
import java.util.*;

class Array5
{
    public static void main(String a[])
    {   int iSize = 0, iCnt =0,EvenElements =0,OddElements = 0,iSumE=0,iSumO=0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of an array");
         iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements of an array");
        for(iCnt =0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();

        }
        for(iCnt =0;iCnt<Arr.length;iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                EvenElements = Arr[iCnt];
                iSumE = iSumE +EvenElements;
            }
            else
            {
                OddElements = Arr[iCnt];
                iSumO = iSumO + OddElements;
            }
        }

        System.out.println("Sum of even elements are " + iSumE);
        System.out.println("Sum of odd elements are " + iSumO);
        
    }
}