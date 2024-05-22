import java.util.Scanner;

public class j2 
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n,i,j,c=0,f;
            System.out.print("Enter array=");
            int m[]=new int[5];
            for(i=0;i<5;i++)
            {
                m[i]=sc.nextInt();
            }
            System.out.print("Enter number to search=");
            n=sc.nextInt();
            for(i=0;i<5;i++)
            {
                n=m[i];
                f=0;
                for(j=2;j<=n/2;j++)
                {
                    if(n%j==0)
                    {
                        f=1;
                        break;
                    }
                }
                if(f==0)
                {
                    System.out.println(m[i]);
                    c=c+1;
                }
                else
                {
                    System.out.println("Total prime="+c);
                }
            }
        }
    }    
}
