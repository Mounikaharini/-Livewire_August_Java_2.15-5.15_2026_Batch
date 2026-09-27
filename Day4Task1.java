
package mounika;



import java.util.Scanner;



public class day1 {



	public static void main(String[] args) {

	

		Scanner s = new Scanner(System.in);

//		System.out.println("Enter a number : ");

//		int a = s.nextInt();

//		if((a>=1 && a<=100) && (a%2==0)) {

//			System.out.println("Yes");

//		}

//		else {

//			System.out.println("No");

//		}

		

		//iterative control

		

		//loop - 2 types

		

		//entry check loop -> first check the condition

		//for loop , while loop

		

		//for loop -> count based

		//increment loop

		

		//for syntax

//		for(int initial value; condition; inc/dec value) {

//			#block of code

//		}

//		for(int i=1;i<=10;i++) {

//			System.out.println(i);

//		}

//		for(int i=2;i<=10;i+=2) {

//			System.out.println(i);

//		}

//		for(int i=3;i<=30;i+=3) {

//			System.out.println(i);

//		}

		

//		5 - 500 -> 5 multiples 

//		for(int i=5;i<=500;i+=5) {

//			System.out.println(i);

//		}

		

		//sum of n natural numbers

//		int n = 10;

//		int sum = 0;

//		for(int i=1;i<=n;i++) {

//			sum = sum + i;

//		}

//		System.out.println(sum);

		

		//sum of even n natural numbers

//		int n = 10;

//		int sum = 0;

//		for(int i=2;i<=n;i+=2) {

//			sum = sum + i;

//		}

//		System.out.println(sum);

		

		//sum of odd n natural numbers

//		int n = 10;

//		int sum = 0;

//		for(int i=1;i<=n;i+=2) {

//			sum = sum + i;

//		}

//		System.out.println(sum);

		

		//decrement loop

		 //5 4 3 2 1

//		for(int i=5;i>=1;i--) {

//			System.out.println(i);

//		}

//		

//		for(int i=10;i>=1;i--) {

//			System.out.println(i);

//		}

		

		

		//nested loop

		

//		* * * * * 

//		* * * * * 

//		* * * * * 

//		* * * * * 

//		* * * * * 

//		

//		for(int j=1;j<=5;j++) {

//			for(int i=1;i<=5;i++) {

//				System.out.print("* ");

//			}

//			System.out.println();

//		}

		

		//1 1 1 1 1 

		//2 2 2 2 2

		//3 3 3 3 3

		//4 4 4 4 4

		//5 5 5 5 5

		

//		for(int j=1;j<=5;j++) {

//			for(int i=1;i<=5;i++) {0

//				System.out.print(j +" ");

//			}

//			System.out.println();

//		}

//		

		//1 2 3 4 5

		//1 2 3 4 5

		//1 2 3 4 5

		//1 2 3 4 5

		//1 2 3 4 5

		

//		for(int j=1;j<=5;j++) {

//			for(int i=1;i<=5;i++) {

//				System.out.print(i +" ");

//			}

//			System.out.println();

//		}

		

//		1 1 1 1 1 

//		2       2

//		3       3

//		4       4

//		5 5 5 5 5

		



//		for(int j=1;j<=5;j++) {

//			for(int i=1;i<=5;i++) {

//				System.out.print((i==5 || i==1 || j==1 || j==5)?(j+" "):"  ");

//			}

//			System.out.println();

//		}

		

		//* * * * *

		//*       *

		//*       *

		//*       *

		//* * * * *

		

//		for(int j=1;j<=5;j++) {

//			for(int i=1;i<=5;i++) {

//				System.out.print((i==5 || i==1 || j==1 || j==5)?"* ":"  ");

//			}

//			System.out.println();

//		}

		

//		* 

//		* * 

//		* * * 

//		* * * * 

//		* * * * * 

//		for(int j=1;j<=5;j++) {

//			for(int i=1;i<=j;i++) {

//				System.out.print("* ");

//			}

//			System.out.println();

//		}

			

//		* * * * * 

//		  * * * * 

//		    * * * 

//		      * * 

//		        * 

//		for(int j=1;j<=5;j++) {

//			for(int k=1;k<j;k++) {

//				System.out.print("  ");

//			}

//			for(int i=j;i<=5;i++) {

//				System.out.print("* ");

//			}

//			System.out.println();

//		}

//		



//		5! = 5*4*3*2*1 = 120

		

		//factorial of an given number

//		int n = 5;

//		int sum = 1;

//		for(int i=n;i>=1;i--) {

//			sum = sum * i;

//		}

//		System.out.println(sum);

		

//		A

//		A B 

//		A B C 

//		A B C D

//		A B C D E

		

//		for(int i=1;i<=5;i++) {

//			for(int j=1;j<=i;j++) {

//				System.out.print(((char)(64+j))+" ");

//			}

//			System.out.println();

//		}

//		

//		z

//		z y

//		z y x 

//		z y x w

//		z y x w v

		

//		for(int i=1;i<=5;i++) {

//			for(int j=1;j<=i;j++) {

//				System.out.print(((char)(123-j))+" ");

//			}

//			System.out.println();

//		}

		

		//while loop -> condition based

		

//		int i = 1;

//		while(i<=5) {

//			System.out.println(i);

//			i++;

//		}

//		

//		int i = 5;

//		while(i>=1) {

//			System.out.println(i);

//			i--;

//		}

//		

		

		//count the digits

		int n = 528;

		

		int count = 0;

		while(n>0) {

			n=n/10;

			count++;

		}

		System.out.println(count);

		

		//sum of digits

		int n = 1234;

//		1234%10 -> 4 => sum = 4

//		1234/10 -> 123

//		

//		123%10 -> 3 => sum = 4+3 = 7

//		123/10 -> 12

//		

//		12%10 -> 2 => sum = 7 + 2 = 9

//		12/10 -> 1

//		

//		1%10 -> 1 => sum = 9 + 1 = 10

//		1/10 -> 0

		

		int sum = 0;

		while(n>0) {

			int r = n%10;

			sum = sum + r;

			n = n/10;

		}

		System.out.println(sum);

		

		//exit check loop -> first execute the block

		//do while ->same as while

				

		//do-while 

		

		//1 2 3 4 5

		int i = 1;

		do {

			System.out.println(i);

			i++;

		}while(i<=5);

		

		//10

		int i = 10;

		do {

			System.out.println(i);

			i++;

		}while(i<=5);

		

		

		

		

		

		

		

		

		

		

		



	}



}

