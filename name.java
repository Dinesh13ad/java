class name{
    public static void main(String[]args)throws Exception{
        int n=11;

        for (int i=0;i<n;i++)
        {
            Thread.sleep(500);
            for (int j=0;j<n;j++)//box1
            {
                if(i==0 || j==n-1 || i==n-1|| j==1)
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++)//box2
            {
                if(i==0 || i==n-1 || j==n/2)
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++)//box3
            {
                if(j==n-1 || j==0 || i==j)
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++)//box4
            {
                if(i==0 || j==0 || i==n-1 || i==n/2 )
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++)//box5
            {
                if(i==0 || i==n-1 || j==0 && i<=n/2 || j==n-1 && i>=n/2 || i==n/2 )
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++)//box6
            {
                if(j==n-1 || i==n/2|| j==0)
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            } 
            System.out.println();
        }
    }
}
