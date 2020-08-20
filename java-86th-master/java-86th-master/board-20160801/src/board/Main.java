package board;

import ui.BaseUI;
import ui.BoardUI;

public class Main {
	public static void main(String[] args) {
		BaseUI ui = null;
		ui = new BoardUI();
		ui.execute();
	}
}
