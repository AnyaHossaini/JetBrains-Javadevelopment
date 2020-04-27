import java.util.Scanner; // Reads in data 

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        
        if(a < 1)
        {
            System.out.println("no army");
        }
        else if (a>=1 && a <=19)
        {
            System.out.println("pack");
        }
        else if(a >= 20 && a <=249 )
        {
            System.out.println("throng");
        }
        else if(a >= 250 && a <= 999)
        {
            System.out.println("zounds");  
        }
        else if(a >= 1000)
        {
            System.out.println("legion"); 
        }
        else
        {
            System.out.println("We really shouldn't be here");  
        }
    }
}
