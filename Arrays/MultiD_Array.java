package Arrays;
class MultiD_Array {
    public static void main(String [] args)
    {
        int array[][] = {{1,2,3},{4,5,6},{7,1,2}};
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                System.out.println(array[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
