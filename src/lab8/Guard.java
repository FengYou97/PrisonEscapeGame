package lab8;

public class Guard {
	private int row = 1;
	private int column = 1;
	
	public Guard (int row, int column) {
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

	@Override
	public String toString() {
		return "Guard [row=" + row + ", column=" + column + "]";
	}
}
