package Webtoon.ui;

import java.util.Scanner;

import Webtoon.MembershipDAO;
import Webtoon.WebtoonDAO;

public abstract class BaseUI {
	protected char viewChar = '-';
	protected int viewCount = 30;
	protected Scanner sc=new Scanner(System.in);
	protected static WebtoonDAO wdao=new WebtoonDAO();
	protected static MembershipDAO mdao=new MembershipDAO();
	public abstract void execute();
}
