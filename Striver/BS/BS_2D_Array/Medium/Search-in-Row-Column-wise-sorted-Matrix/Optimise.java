//if we start from index = 0,0 then ambiguity will occur, where to go from
//either right or bottom
//similarly for other
//if we start from index = 0,0 then ambiguity will occur, where to go from
//either right or bottom
//similarly for other
class Search_a_2D_Matrix_II {
	public static boolean Search(int[][] matrix, int item) {
		int row=0;
		int col=matrix[0].length-1;
		while(row<matrix.length && col>=0) {
			if(matrix[row][col]==item) {
				return true;
			}
			else if(matrix[row][col]>item) {
				col--;
			}
			else {
				row++;
			}
		}
		return false;

	}

}