package Webtoon.ui;


import java.util.ArrayList;

import Webtoon.WebtoonVO;


public class SelectOneUI extends BaseUI {
	public void execute() {
		ArrayList<WebtoonVO> list = wdao.selectWebtoonBycode();
		System.out.printf("전체 갯수는 %d 입니다.\n", list.size());
		System.out.println("제목\t장르\t연재날짜\t작가 이름\t조회수\t총 추천\t작가의 말\t연령 제한");
				
		for (int i = 0; i < list.size(); i++) {
			WebtoonVO w =  list.get(i);
			System.out.printf("%s\t%s\t%s\t%s\t%d\t%d\t%s\t%d\n", 
					w.getWebtoonTitle(), w.getGenreType(),w.getWeekDay(),w.getWriterNickname(),
					w.getViewCount(),w.getRecomCount(),w.getWebtoonSubContent(),w.getAgeLimit());

		}
	}
}
