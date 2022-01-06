import java.util.ArrayList;
import java.util.Scanner;

public class Mat {
    public static void main(String []st)
    {
        Scanner s=new Scanner(System.in);
        boolean flag=true;
do {
            System.out.println("Enter the Decimal No:");
            int n=s.nextInt();
            System.out.println("Till which base you want to convert into ");
            int b=s.nextInt();
            for(int i=2;i<=b;i++) {
                    System.out.print("Base "+i+": ");
                    contohigherbase(n, i);

            }
            System.out.println("Do you want to continue[1/0]");
            int m= s.nextInt();
            if(m==0)
            {
                flag=false;
            }


        }while (flag);
        System.out.println("BYE");


    }
static void contohigherbase(int n,int b)
    {
        int sum = 0;
        ArrayList<Integer> li = new ArrayList<>();
        while (n > 0) {
            li.add(n % b);
            n = n / b;

        }

        for (int i = li.size()-1; i >= 0; i--)
        {
            if(li.get(i)>9 && li.get(i)<b)
            {
                System.out.print((char) (64+(li.get(i)-9)));
            }
            else
            {
                System.out.print(li.get(i));
            }


        }
        System.out.println();
    }
}