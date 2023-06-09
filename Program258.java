
class ArrayX
{
    public int Arr[]; //in c++ we write pointer

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }
}

class Program258              
{
    public static void main(String ar[])
    {
        ArrayX obj = new ArrayX(5);
    }
}