package lab8;

public class Lunatic {
	private int row;
	private int column;
	
	public Lunatic(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	public void scanPath() {
		
	}
	
	public boolean guardIsNorth (int column) {
		for (int j = column ; column > 0 ; column--) {
			
		}
		return false;
		
	}
	
	public boolean guardIsEast() {
		return false;
		
	}
	
	public boolean guardIsSouth() {
		return false;
		
	}
	
	public boolean guardIsWest() {
		return false;
		
	}
}
