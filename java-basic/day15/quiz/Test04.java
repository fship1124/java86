package day15.quiz;

public class Test04 {
	public static void main(String[] args) {
		// data/a.txt 파일을 data/aa/bb 디렉토리에 
		// acopy.txt 파일명으로 복사한다.
		// 만약, data/aa/bb 디렉토리가 존재하지 않는다면
		// 해당 디렉토리를 먼저 생성하고 파일의 내용을
		// 복사한다.
//		copy("data/a.txt", "data/aa/bb/acopy.txt");
		
		// 복사할 대상 위치가 디렉토리면
		// 원래의 파일명으로 복사시킨다.
		// data/aa/bb/a.txt 파일로 저장된다.
//		copy("data/a.txt", "data/aa/bb");
	}
}




