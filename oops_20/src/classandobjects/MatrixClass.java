package classandobjects;

public class MatrixClass {

}

/*
 public class mat{
	int [][] matrix;
	
	mat(int [][] mat)
	{
		matrix=mat;
	}
		
	
	    public static mat add(mat a,mat b)
	    {
	        int rows = a.matrix.length;
        int columns = a.matrix[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = a.matrix[i][j] + b.matrix[i][j];
            }
        }

        return new mat(result);
	    }
	    public static mat multiply(mat a,mat b)
	    {
	           int rows = a.matrix.length;
        int columns = b.matrix[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < a.matrix[0].length; k++) {
                    result[i][j] += a.matrix[i][k] * b.matrix[k][j];
                }
            }
        }

        return new mat(result);
	    }
	    public static mat transpose(mat m)
	    {
	    	 int rows = m.matrix[0].length;
        int columns = m.matrix.length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = m.matrix[j][i];
            }
        }

        return new mat(result);
	    }
	    public static mat rotate(mat m)
	    {
	    	   int rows = m.matrix.length;
        int columns = m.matrix[0].length;
        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[columns - j - 1][i] = m.matrix[i][j];
            }
        }

        return new mat(result);
	    }
	    public  void print()
	    {
	        for(int i=0;i<matrix.length;i++)
	        {
	            for(int j=0;j<matrix[0].length;j++)
	            {
	                System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }
	 }
 */