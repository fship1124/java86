package Webtoon.ui;

import Webtoon.WebtoonVO;

// 입력받을값 : 웹툰ID(시퀀스생성), 웹툰제목, 장르, 멤버ID, 연재요일, 연령제한, 웹툰요약, 시작일(sysdate) 
public class InsertWebtoonUI extends BaseUI{
	public void execute() {
		WebtoonVO wv = new WebtoonVO();
			
		System.out.print("웹툰 제목 : ");
		String webtoonTitle = sc.nextLine();
		wv.setWebtoonTitle(webtoonTitle);
		
		System.out.print("장르 : ");
		int genreID = Integer.parseInt(sc.nextLine());
		wv.setGenreID(genreID);
		
		System.out.print("ID : ");
		String memberID = sc.nextLine();
		wv.setMemberID(memberID);
				
		System.out.print("연재 요일 : ");
		String weekDay = sc.nextLine();
		wv.setWeekDay(weekDay);
		
		System.out.print("연령 제한 : ");
		int ageLimit = Integer.parseInt(sc.nextLine());
		wv.setAgeLimit(ageLimit);
		
		System.out.print("웹툰 요약 : ");
		String webtoonSummary = sc.nextLine();
		wv.setWebtoonSummary(webtoonSummary);
		
		wdao.insertWebtoon(wv);
		
	}
}
