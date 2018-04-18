package Second_Renju;

public class Go {
	Board boa = new Board();

	/**
	 * 打印棋盘
	 */
	public void showInfo() {
		for (int i = boa.getArr().length - 1; i >= 0; i--) {
			System.out.print("" + (i + 1) + "\t");
			for (int j = 0; j < boa.getArr()[i].length; j++) {
				boa.getArr()[i][j] = " ";
				System.out.print(boa.getArr()[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i <= boa.getArr().length; i++) {
			System.out.print("" + i + "\t");
		}
	}

	/**
	 * 游戏进程显示
	 */
	public void showgo() {
		for (int i = boa.getArr().length - 1; i >= 0; i--) {
			System.out.print("" + (i + 1) + "\t");
			for (int j = 0; j < boa.getArr()[i].length; j++) {
				System.out.print(boa.getArr()[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i <= boa.getArr().length; i++) {
			System.out.print("" + i + "\t");
		}
	}

	/**
	 * 输入棋子坐标
	 * 
	 * @param a
	 * @param b
	 * @param Piece
	 */
	public void ChangeBoard(int a, int b, String Piece) {
		for (int i = boa.getArr().length - 1; i >= 0; i--) {
			for (int j = 0; j < boa.getArr()[i].length; j++) {
				if (i == b && j == a) {
					boa.getArr()[i][j] = Piece;
				}
			}
		}
	}

	/**
	 * 判定棋子是否重复
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public boolean ValPiece(int a, int b) {
		if (boa.getArr()[b][a].equals("O") || boa.getArr()[b][a].equals("X")) {
			return false;
		}
		return true;
	}

	/**
	 * 判定玩家一获胜条件
	 * 
	 * @return
	 */
	public boolean ValPlay1() {
		for (int i = boa.getArr().length - 1; i >= 0; i--) {
			for (int j = 0; j < boa.getArr()[i].length; j++) {
				if ((i <= 19 && i >= 16) && (j >= 0 && j <= 15)) {
					if ((boa.getArr()[i][j].equals("O") && boa.getArr()[i - 1][j + 1].equals("O")
							&& boa.getArr()[i - 2][j + 2].equals("O") && boa.getArr()[i - 3][j + 3].equals("O")
							&& boa.getArr()[i - 4][j + 4].equals("O"))
							|| (boa.getArr()[i][j].equals("O") && boa.getArr()[i - 1][j].equals("O")
									&& boa.getArr()[i - 2][j].equals("O") && boa.getArr()[i - 3][j].equals("O")
									&& boa.getArr()[i - 4][j].equals("O"))
							|| (boa.getArr()[i][j].equals("O") && boa.getArr()[i][j + 1].equals("O")
									&& boa.getArr()[i][j + 2].equals("O") && boa.getArr()[i][j + 3].equals("O")
									&& boa.getArr()[i][j + 4].equals("O"))) {
						return true;
					}
				} else if ((i <= 3 && i >= 0) && (j >= 0 && j <= 15)) {
					if ((boa.getArr()[i][j].equals("O") && boa.getArr()[i + 1][j + 1].equals("O")
							&& boa.getArr()[i + 2][j + 2].equals("O") && boa.getArr()[i + 3][j + 3].equals("O")
							&& boa.getArr()[i + 4][j + 4].equals("O"))
							|| (boa.getArr()[i][j].equals("O") && boa.getArr()[i + 1][j].equals("O")
									&& boa.getArr()[i + 2][j].equals("O") && boa.getArr()[i + 3][j].equals("O")
									&& boa.getArr()[i + 4][j].equals("O"))
							|| (boa.getArr()[i][j].equals("O") && boa.getArr()[i][j + 1].equals("O")
									&& boa.getArr()[i][j + 2].equals("O") && boa.getArr()[i][j + 3].equals("O")
									&& boa.getArr()[i][j + 4].equals("O"))) {
						return true;
					}
				} else if ((i <= 15 && i >= 4) && (j >= 0 && j <= 15)) {
					if ((boa.getArr()[i][j].equals("O") && boa.getArr()[i + 1][j + 1].equals("O")
							&& boa.getArr()[i + 2][j + 2].equals("O") && boa.getArr()[i + 3][j + 3].equals("O")
							&& boa.getArr()[i + 4][j + 4].equals("O"))
							|| (boa.getArr()[i][j].equals("O") && boa.getArr()[i + 1][j].equals("O")
									&& boa.getArr()[i + 2][j].equals("O") && boa.getArr()[i + 3][j].equals("O")
									&& boa.getArr()[i + 4][j].equals("O"))
							|| (boa.getArr()[i][j].equals("O") && boa.getArr()[i][j + 1].equals("O")
									&& boa.getArr()[i][j + 2].equals("O") && boa.getArr()[i][j + 3].equals("O")
									&& boa.getArr()[i][j + 4].equals("O"))
							|| (boa.getArr()[i][j].equals("O") && boa.getArr()[i - 1][j + 1].equals("O")
									&& boa.getArr()[i - 2][j + 2].equals("O") && boa.getArr()[i - 3][j + 3].equals("O")
									&& boa.getArr()[i - 4][j + 4].equals("O"))) {
						return true;
					}
				} else if ((i <= 19 && i >= 4) && (j >= 16 && j <= 19)) {
					if ((boa.getArr()[i][j].equals("O") && boa.getArr()[i - 1][j].equals("O")
							&& boa.getArr()[i - 2][j].equals("O") && boa.getArr()[i - 3][j].equals("O")
							&& boa.getArr()[i - 4][j].equals("O"))) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * 判定玩家二获胜条件
	 * 
	 * @return
	 */
	public boolean ValPlay2() {
		for (int i = boa.getArr().length - 1; i >= 0; i--) {
			for (int j = 0; j < boa.getArr()[i].length; j++) {
				if ((i <= 19 && i >= 16) && (j >= 0 && j <= 15)) {
					if ((boa.getArr()[i][j].equals("X") && boa.getArr()[i - 1][j + 1].equals("X")
							&& boa.getArr()[i - 2][j + 2].equals("X") && boa.getArr()[i - 3][j + 3].equals("X")
							&& boa.getArr()[i - 4][j + 4].equals("X"))
							|| (boa.getArr()[i][j].equals("X") && boa.getArr()[i - 1][j].equals("X")
									&& boa.getArr()[i - 2][j].equals("X") && boa.getArr()[i - 3][j].equals("X")
									&& boa.getArr()[i - 4][j].equals("X"))
							|| (boa.getArr()[i][j].equals("X") && boa.getArr()[i][j + 1].equals("X")
									&& boa.getArr()[i][j + 2].equals("X") && boa.getArr()[i][j + 3].equals("X")
									&& boa.getArr()[i][j + 4].equals("X"))) {
						return true;
					}
				} else if ((i <= 3 && i >= 0) && (j >= 0 && j <= 15)) {
					if ((boa.getArr()[i][j].equals("X") && boa.getArr()[i + 1][j + 1].equals("X")
							&& boa.getArr()[i + 2][j + 2].equals("X") && boa.getArr()[i + 3][j + 3].equals("X")
							&& boa.getArr()[i + 4][j + 4].equals("X"))
							|| (boa.getArr()[i][j].equals("X") && boa.getArr()[i + 1][j].equals("X")
									&& boa.getArr()[i + 2][j].equals("X") && boa.getArr()[i + 3][j].equals("X")
									&& boa.getArr()[i + 4][j].equals("X"))
							|| (boa.getArr()[i][j].equals("X") && boa.getArr()[i][j + 1].equals("X")
									&& boa.getArr()[i][j + 2].equals("X") && boa.getArr()[i][j + 3].equals("X")
									&& boa.getArr()[i][j + 4].equals("X"))) {
						return true;
					}
				} else if ((i <= 15 && i >= 4) && (j >= 0 && j <= 15)) {
					if ((boa.getArr()[i][j].equals("X") && boa.getArr()[i + 1][j + 1].equals("X")
							&& boa.getArr()[i + 2][j + 2].equals("X") && boa.getArr()[i + 3][j + 3].equals("X")
							&& boa.getArr()[i + 4][j + 4].equals("X"))
							|| (boa.getArr()[i][j].equals("X") && boa.getArr()[i + 1][j].equals("X")
									&& boa.getArr()[i + 2][j].equals("X") && boa.getArr()[i + 3][j].equals("X")
									&& boa.getArr()[i + 4][j].equals("X"))
							|| (boa.getArr()[i][j].equals("X") && boa.getArr()[i][j + 1].equals("X")
									&& boa.getArr()[i][j + 2].equals("X") && boa.getArr()[i][j + 3].equals("X")
									&& boa.getArr()[i][j + 4].equals("X"))
							|| (boa.getArr()[i][j].equals("X") && boa.getArr()[i - 1][j + 1].equals("X")
									&& boa.getArr()[i - 2][j + 2].equals("X") && boa.getArr()[i - 3][j + 3].equals("X")
									&& boa.getArr()[i - 4][j + 4].equals("X"))) {
						return true;
					}
				} else if ((i <= 19 && i >= 4) && (j >= 16 && j <= 19)) {
					if ((boa.getArr()[i][j].equals("X") && boa.getArr()[i - 1][j].equals("X")
							&& boa.getArr()[i - 2][j].equals("X") && boa.getArr()[i - 3][j].equals("X")
							&& boa.getArr()[i - 4][j].equals("X"))) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
