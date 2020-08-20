package day12.quiz;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
		BankService bs = new BankService();

		try {
			bs.execute();
		} catch (BankException b) {
			b.printStackTrace();
		}
		
		
		
	}
}






/*

 계좌주 : 홍길동
 입금액 : 10000
계좌가 개설되었습니다.
----------------------
고객명 : 홍길동
계좌번호 : 1
초기입금액 : 10000
---------------------
선택(1.인출 2.입금 3.종료) : 1
인출할 금액(원) : 5000
5000원을 인출하였습니다. (잔액 : 5000)
선택(1.인출 2.입금 3.종료) : 2
입금할 금액(원) : 1
선택(1.인출 2.입금 3.종료) : 1
인출할 금액(원) : 5002

_15_exception.quiz.c : 잔액부족(현재 : 5001원)

*/