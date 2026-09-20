package TheoryClasses;

public class Day3task1 {

	public static void main(String[] args) {
/*		
		512	256	128	64	32	16	8	4	2	1
18				0	0	0	1	0	0	1	0		
16				0	0	0	1	0	0	0	0												
&				0	0	0	1	0	0	0	0		18&16->16
|				0	0	0	1	0	0	1	0		18|16->18
^				0	0	0	0	0	0	1	0		18^16->2
<<		0	0	0	1	0	0	0	0				16<<2->64
>>						0	0	0	1	0	0		16>>2->4
+ve -> -(n+1) -> -(5+1) -> -6
-ve -> +(n-1) -> +(5-1) -> +4
*/
		
		System.out.println(18&16);
		System.out.println(18|16);
		System.out.println(18^16);
		System.out.println(16<<2);
		System.out.println(16>>2);
		System.out.println(~5);
		System.out.println(~(-5));
		
		int n = 90;
		String op = n>0?"+ve":"-ve";
		System.out.println(op);
		
	}

}
