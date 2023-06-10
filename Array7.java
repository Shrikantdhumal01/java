import java.lang.*;
import java.util.*;

class Digit
{
    public boolean CheckOccurance(int Arr[],int iSize,int iNo)
    {   int Occurance = 0;
        int iCnt =0;
        for(iCnt = 0; iCnt<Arr.length;iCnt++)
        {
            if((Arr[iCnt]) == iNo)
            {
                Occurance++;
            }
            
        }

         
            if(Occurance == 0)
            {
                return false;
            }
            else{
                return true;
            }

      
    }

    
}

class Array7
{  
    public static void main (String a[])
    {  boolean bRet = false;
       int iSize =0;
       int iCnt =0;
       int iValue =0;
       int Occurance =0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array");
        iSize =  sobj.nextInt();

        int Arr[] = new int [iSize];

        System.out.println("Enter the elements of an array");

            for(iCnt = 0; iCnt < Arr.length; iCnt++)
            {
             Arr[iCnt] = sobj.nextInt();
            }

        System.out.println("Enter the number that you want to check");
        iValue = sobj.nextInt();

            Digit dobj = new Digit();

            bRet = dobj.CheckOccurance(Arr,iSize,iValue);

            if(bRet == true)
            {

        System.out.println(iValue + " Occured in the array");    
            }
            else
            {
              System.out.println(iValue + " not Occured in the array");    
            }


    }

}