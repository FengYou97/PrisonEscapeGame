package lab8;

public class Coordinate {

	private int row;
	private int column;
	private char block;

	public Coordinate() {
		column = 0;
		row = 0;
		block = ' ';
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

	public char getBlock() {
		return block;
	}

	public void setBlock(char block) {
		this.block = block;
	}

	@Override
	public String toString() {
		return "Coordinate [row=" + row + ", column=" + column + ", block=" + block + "]";
	}

	public char getValue() {
		return this.block;
	}

}
