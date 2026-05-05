class pattern{
    public static void main(String []args)throws Exception
    {
        
        int n=11;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                Thread.sleep(50);
                if(i<=n/2 && j<=n/2)
                {
                    System.out.print("$ ");
                }
                else if(i<=n/2 && j>n/2)
                {
                    System.out.print("# ");
                }
                else if(i>n/2 && j>n/2)
                {
                    System.out.print("& ");
                }
                else if(i>=n/2 && j<=n/2)
                {
                    
                    System.out.print("% ");
                }
                
                
            }
            System.out.println();
            
        } 
    }

}