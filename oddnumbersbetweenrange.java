public class oddnumbersbetweenrange {

    public static void main(String args[])
    {
        int start=2;
        int end=15;

        for (int i=start;i<end;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }

    }
}
