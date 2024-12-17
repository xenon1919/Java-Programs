import java.util.Scanner;
public class even {
    public static void main(String args[]) {
        System.out.println("Enter n value upto where n even numbers are to be generated\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for(i=0;i<=n;i++)
        {
            if((i%2)==0)
            {
                System.out.println(i);
            }
          sc.close(); 
}
}
}