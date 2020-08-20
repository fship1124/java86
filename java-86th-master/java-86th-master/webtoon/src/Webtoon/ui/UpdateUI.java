package Webtoon.ui;



public class UpdateUI extends BaseUI {
	public void execute() {
			boolean modFlag = wdao.updateWebtoon();
			if (modFlag == false) {
				System.out.println("입력된 번호는 존재하지 않습니다.");
			} else {
				System.out.println("게시글이 수정되었습니다.");
			}
		
	}
}
