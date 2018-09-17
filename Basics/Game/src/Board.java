
public class Board {
	
	static public int[][] board = new int[9][9];
	
	
	
	static public void resetBoard()
	{
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
				board[i][j] = 0;
			}
		}
	}
	
	
}
