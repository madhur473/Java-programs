import java.util.Scanner;

public class MatrixApplication2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows do you want in Matrix");
		int r1=sc.nextInt();//r1=4
		int c1=0;
		//allocate memory for given rows
		int mat1[][]=new int[r1][];

		//allocate col for each row
		System.out.println("Enter col for each row");
		for(int i=0;i<mat1.length;i++)//i=3<4
		{
			System.out.println("Enter col for "+(i+1)+" row");
			c1=sc.nextInt();//1 2 3 4
			mat1[i]=new int[c1];
		}

		//create matrix2
		System.out.println("How many rows do you want in Matrix2");
		int r2=sc.nextInt();//r1=4
		int c2=0;
		//allocate memory for given rows
		int mat2[][]=new int[r2][];
		//allocate col for each row
		System.out.println("Enter col for each row");
		for(int i=0;i<mat2.length;i++)//i=3<4
		{
			System.out.println("Enter col for "+(i+1)+" row");
			c2=sc.nextInt();//1 2 3 4
			mat2[i]=new int[c2];
		}
		boolean b=true;
		//check both matrix rows and col
		if(mat1.length==mat2.length) {
			for(int i=0;i<mat1.length;i++)//i=2
			{
				//check col for each row
				if(mat1[i].length!=mat2[i].length) {//4!=3
					b=false;
					break;
				}
			}
		}
		else
		{
			b=false;
		}

		if(b)
		{
			System.out.println("Enter elements in matrix1");
			for(int i=0;i<mat1.length;i++)//4<4
			{
				for(int j=0;j<mat1[i].length;j++)//1<1
				{
					mat1[i][j]=sc.nextInt();	
				}
			}


			System.out.println("Enter elements in matrix2");
			for(int i=0;i<mat2.length;i++)//4<4
			{
				for(int j=0;j<mat2[i].length;j++)//1<1
				{
					mat2[i][j]=sc.nextInt();	
				}
			}
			int mat3[][]=new int[mat1.length][];
			for(int i=0;i<mat3.length;i++)
			{
				mat3[i]=new int [mat1[i].length];
			}
			
			for(int i=0;i<mat3.length;i++)
			{
				for(int j=0;j<mat3[i].length;j++)
				{
					mat3[i][j]=mat1[i][j]+mat2[i][j];
				}
			}
			System.out.println("matrix1");
			for(int i=0;i<mat1.length;i++)//4<4
			{
				for(int j=0;j<mat1[i].length;j++)//1<1
				{
					System.out.print(mat1[i][j]+"\t");	
				}
				System.out.println();
			}

			System.out.println("matrix2\n");
			for(int i=0;i<mat2.length;i++)//4<4
			{
				for(int j=0;j<mat2[i].length;j++)//1<1
				{
					System.out.print(mat2[i][j]+"\t");	
				}
				System.out.println();
			}		
			
			System.out.println("matrix3- Addition---\n");
			for(int i=0;i<mat3.length;i++)//4<4
			{
				for(int j=0;j<mat3[i].length;j++)//1<1
				{
					System.out.print(mat3[i][j]+"\t");	
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("add not possible");
		}


	}
}