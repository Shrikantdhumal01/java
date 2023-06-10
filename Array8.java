import java.lang.*;
import java.util.*;

class Array
{ 
    public int Max(int Arr[] , int iSize)
    {   int iCnt =0;
        int Maximum = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] > Maximum)
            {
                Maximum = Arr[iCnt];
            }
        }
        return Maximum;

    }

}

class Array8
{
    public static void main (String a[])
    {  int iRet = 0;
       int iSize =0;
       int iCnt =0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements of an array");

        for(iCnt = 0; iCnt<Arr.length;iCnt++)
        {
        Arr[iCnt] = sobj.nextInt();
        }

        Array Aobj = new Array();

        iRet = Aobj.Max(Arr,iSize);

        System.out.println("Maximum element of an array is "+iRet);


        




    }

}