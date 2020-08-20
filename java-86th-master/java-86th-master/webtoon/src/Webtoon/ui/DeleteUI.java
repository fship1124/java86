package Webtoon.ui;

public class DeleteUI extends BaseUI {
	public void execute() {
		System.out.print("삭제할 웹툰의 고유번호를 입력하세요 : ");
		int delNo = Integer.parseInt(sc.nextLine());
		int cnt = wdao.deleteBoard(delNo);
		if(cnt == 0){
			System.out.println(
					"입력하신 번호에 해당하는 웹툰이 없습니다.");
		}else {
			System.out.println("웹툰이 삭제되었습니다.");
		}
	}

}
