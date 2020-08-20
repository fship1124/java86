package ui;

import java.util.Scanner;

import board.BoardDAO;

public abstract class BaseUI {
	BoardDAO dao = new BoardDAO();
	Scanner sc = new Scanner(System.in);
	int count=50; char c = '*';
	public abstract void execute();
}
