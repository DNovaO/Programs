import java.util.Scanner;

public class largestnumber{
    public static void main(String[]args)
        {
            Scanner input=new Scanner(System.in);

            int number;
            System.out.println("Enter a number");
                number=input.nextInt();
            int largestnumb=number;
                while(number>=0)
            {
               
                if(number>largestnumb)
                {
                    largestnumb=number;
                }
                System.out.println("Enter a number");
                number=input.nextInt();
            }   

        System.out.println("The largest number is "+ largestnumb);
            input.close();
}
}