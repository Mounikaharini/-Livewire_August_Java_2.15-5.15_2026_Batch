package THEORY;

import java.util.Scanner;

public class class_4_10_2026 {
	public static void main(String[] args) {
		
		//check prime or not
//		int n = 17;
//		int c=0;
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				c++;
//			}
//		}
//		if(c==2) {
//			System.out.println("Prime");
//		}
//		else {
//			System.out.println("Not a prime");
//		}
//		
		
//		int n = 17;
//		int c=0;
//		for(int i=2;i<n;i++) {
//			if(n%i==0) {
//				c++;
//			}
//		}
//		if(c==0) {
//			System.out.println("Prime");
//		}
//		else {
//			System.out.println("Not a prime");
//		}
		
		
//		
//		int n = 178;
//		int c=0;
//		for(int i=2;i<=n/2;i++) {
//			if(n%i==0) {
//				c++;
//			}
//		}
//		if(c==0) {
//			System.out.println("Prime");
//		}
//		else {
//			System.out.println("Not a prime");
//		}
		
		//armstrong number
//		153 = 1^3 + 5^3 + 3^3;
//		153=1+125+27
		
//		int n = 155;
//		int m = n;
//		int value = n;
//		int c = 0;
//		while(n>0) {
//			n/=10;
//			c++;
//		}
//		System.out.println(c);
//		int sum = 0;
//		while(m>0) {
//			int x = m%10;
//			int a = 1;
//			for(int i=1;i<=c;i++) {
//				a = a*x;
//			}
//			sum = sum + a;
//			m/=10;
//		}
//		System.out.println(sum);
//		if(sum==value) {
//			System.out.println("Armstrong Number");
//		}
//		else {
//			System.out.println("Not an Armstrong Number");
//		}
		
		//jumping control
		//break , continue
		
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//			if(i==5) {
//				break;
//			}
//		}
//		
//		for(int i=1;i<=5;i++) {
//			if(i==3) {
//				continue;
//			}
//			else {
//				System.out.println(i);
//			}
//		}
		
		//c-array
//		int a[] = {12,36,96,58,45};
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		//1d array
//		int b[]=new int[5];
//		b[0]=12;
//		b[1]=82;
//		b[2]=85;
//		for(int i=0;i<b.length;i++) {
//			System.out.println(b[i]);
//		}
		
//		int c[][] = new int[2][2];
//		c[0][0]=1;
//		c[0][1]=2;
//		c[1][0]=3;
//		c[1][1]=4;
//		
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<2;j++) {
//				System.out.print(c[i][j] +" ");
//			}
//			System.out.println();
//		}
		
		//User Input
		
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter the Size : ");
//		int n = s.nextInt();
//		
//		s.nextLine();
//		
//		String a[] = new String[n];
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.print("Enter the Data "+(i+1)+": ");
//			a[i]=s.nextLine();
//		}
//		System.out.println();
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		//linear search
		
//		int a[] = {1,3,6,5,2,9,7,1,25,6,9,7,8,2,8,5,9,4,63,14};
//		int key = 255;
//		boolean flag = false;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==key) {
//				System.out.println("Element Found in Index of : "+i);
//				flag = true;
//			}
//		}
//		if(!flag) {
//			System.out.println("Element Not Found");
//		}
		
		//count odd & even
		
		
		
		int a[] = {1,3,6,5,2,9,7,1,25,6,9,7,8,2,8,5,9,4,63,14};
		int even = 0;
		int odd = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Even Count : "+even);
		System.out.println("Odd Count  : "+odd);
		

		
	}
}
