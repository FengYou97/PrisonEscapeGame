package lab8;

public class AsylumMap {

	public Coordinate[][] asylumLayout = new Coordinate[20][20];

	public void makeGrid() {
		for (int column = 0; column < 20; column++) {
			for (int row = 0; row < 20; row++) {
				asylumLayout[column][row] = new Coordinate();

				if (row == 0 || column == 0 || row == 19 || column == 19) {
					if (column == 18 && row == 19) {
						asylumLayout[column][row].setBlock('E');
						asylumLayout[column][row].setRow(row);
						asylumLayout[column][row].setColumn(column);
					} else {
						asylumLayout[column][row].setBlock('W');
						asylumLayout[column][row].setRow(row);
						asylumLayout[column][row].setColumn(column);
					}

				} else {
					if (column == 1 && row == 1) {
						asylumLayout[column][row].setBlock('S');
						asylumLayout[column][row].setRow(row);
						asylumLayout[column][row].setColumn(column);
					} else if (((int) (Math.random() * 5)) == 1) {
						asylumLayout[column][row].setBlock('W');
						asylumLayout[column][row].setRow(row);
						asylumLayout[column][row].setColumn(column);
					} else {
						asylumLayout[column][row].setBlock(' ');
						asylumLayout[column][row].setRow(row);
						asylumLayout[column][row].setColumn(column);
					}
				}
			}
		}
		// for(int j = 0 ; j < 20 ; j++) {
		//   for (int i = 0 ; i < 20; i++) {
		//        System.out.println(asylumLayout[i][j]);
		//    }
		// }
	}

	public void placeGuard(int column, int row) {
		asylumLayout[column][row].setBlock('G');
	}
}
