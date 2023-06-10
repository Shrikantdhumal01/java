import java.lang.*;
import java.util.*;

class Digit
{
    public int CheckOccurance(int Arr[],int iSize,int iNo)
    {   int Occurance = 0;
        int iCnt =0;
        for(iCnt = 0; iCnt<Arr.length;iCnt++)
        {
            if((Arr[iCnt]) == iNo)
            {
                Occurance++;
            }
        }

        return Occurance;
      
    }

    
}

class Array6
{  
    public static void main (String a[])
    {  int iRet = 0;
       int iSize =0;
       int i =0;
       int iValue =0;
       int Occurance =0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array");
        iSize =  sobj.nextInt();

        int Arr[] = new int [iSize];

        System.out.println("Enter the elements of an array");

            for(i = 0; i < Arr.length; i++)
            {
             Arr[i] = sobj.nextInt();
            }

        System.out.println("Enter the number that you want to check");
        iValue = sobj.nextInt();

            Digit dobj = new Digit();

            iRet = dobj.CheckOccurance(Arr,iSize,iValue);

        System.out.println(iValue + " Occured in the array");    
        


    }

}