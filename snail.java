/*Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per night it goes B feets down. In which day the snail will reach the top of the pole?

Input data format

On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.

Sample Input 1:

10
3
2
Sample Output 1:

8
Sample Input 2:

20
7
3
Sample Output 2:

5*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
    
    double height = scanner.nextInt();
    double day = scanner.nextInt();
    double night = scanner.nextInt(); 
    double days = (height - night) / (day - night);
    
    int wholeNumber = (int)days;
    
    if(days - wholeNumber !=0)
    {
       System.out.println(wholeNumber+1); 
    }
    else
    {
        System.out.println(wholeNumber);  
    }
    }
}
