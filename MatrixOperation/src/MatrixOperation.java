import java.util.Scanner;

public class MatrixOperation {
	Scanner sc =new Scanner(System.in);
	
	public int [][] createMatrix(){
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
		return mat1;
	}
	public void input(int mat[][]) {
		System.out.println("Enter elements in Matrix");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
	}
	
	public void displayMatrix(int mat[][]) {
		System.out.println("------------------Matrix------------------");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.println(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public boolean validateMatrix(int mat1[][],int mat2[][]) {
		boolean b=true;
		if(mat1.length==mat2.length) {
			for(int i=0;i<mat1.length;i++)
			{
				if(mat1[i].length!=mat2[i].length) {
					b=false;
					break;
				}
			}
		}
		else
		{
			b=false;
		}
	}
	
	public int [][] addMatrix(int mat1[][],int mat2[][]){
		int mat3 [][]=new int [mat1.length][];
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
		return mat3;
	}
	
	public void subMatrix() {
		
	}
	public void mulMatrix() {
		
	}
}
	
