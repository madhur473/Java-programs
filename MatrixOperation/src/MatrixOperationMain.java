
public class MatrixOperationMain {

	public static void main(String[] args) {
		MatrixOperation mobj=new MatrixOperation();
		int mat1[][]=mobj.createMatrix();
		int mat2[][]=mobj.createMatrix();
		int mat3[][]=null;
		boolean b=mobj.validateMatrix(mat1,mat2);
		if(b) {
			System.out.println("Valid");
			mobj.input(mat1);
			mobj.input(mat2);
			mat3=mobj.addMatrix(mat1, mat2);				
			mobj.displayMatrix(mat1);
			mobj.displayMatrix(mat2);
			System.out.println("---------------MATRIX ADDITION");
			mobj.displayMatrix(mat3);
		}
		else
		{
			System.out.println("add not possible");
		}
	}
}
