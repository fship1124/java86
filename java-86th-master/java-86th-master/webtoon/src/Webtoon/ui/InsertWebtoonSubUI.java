package Webtoon.ui;

import Webtoon.WebtoonVO;

public class InsertWebtoonSubUI extends BaseUI {
	public void execute() {
		WebtoonVO wv = new WebtoonVO();
		
		System.out.print("웹툰 제목 : ");
		String webtoonTitle = sc.nextLine();
		int webtoonID = wdao.searchWebtoonTitle(webtoonTitle);
		wv.setWebtoonID(webtoonID);
		
		System.out.print("회차부제 : ");
		String webtoonSubTitle = sc.nextLine();
		wv.setWebtoonSubTitle(webtoonSubTitle);
		
		System.out.print("회차내용 : ");
		String webtoonSubContent = sc.nextLine();
		wv.setWebtoonSubContent(webtoonSubContent);
		
		if (webtoonID == 0) {
			System.out.println("해당 웹툰은 존재하지 않습니다.");
		} else {
			wdao.insertWebtoonSub(wv);			
		}
		
	}
}
