
public class MatrixApplication {

	public static void main(String[] args) {
		int mat[][]= {
				{10,20,30},
				{40,50,60},
				{70,80,90}
				};
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		int mat2[][]= {
				{10,20},
				{40,50,60},
				{70,80,90,100}
				};
		for(int i=0;i<mat2.length;i++)
		{
			for(int j=0;j<mat2[i].length;j++)
			{
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
	}
}

