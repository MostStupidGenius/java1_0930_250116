package day08.ioStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	// 외부로부터 File 객체를 전달받아 내용을 작성하는
	// 메서드로 변경
	public static void writeFile(File file) {
		// 1. 파일 생성
//		File file = new File("test.txt");

		// 파일을 읽고 쓰는 중에 오류가 발생할 일이 많기 때문에
		// try-catch 구문으로 먼저 묶어준다.
		try {
			// 파일이 존재하는지 여부 검사
			if (!file.exists()) {
				// 파일이 존재하지 않으면 파일 생성
				file.createNewFile();
			}

			// 쓰기를 지원하는 객체를 생성하며
			// file에 대한 정보를 제공하기 위해 해당 객체 전달
			FileWriter writer = new FileWriter(file);

			// 2. 파일에 데이터 쓰기
			// 텍스트 파일을 작성해야 하기 때문에
			// BufferedWriter에 쓰기 객체를 전달해야 한다.
			BufferedWriter bw = new BufferedWriter(writer);

			// 이제 bw를 이용해서 해당 파일에 내용을 작성할 수 있다.
			// 기존 작성된 내용을 삭제하고 새로 작성한다.
			bw.write("Hello, World!\nNewLine!");

			// 모든 쓰기와 읽기 객체는 사용 후에 닫아주어야 한다.
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
	}

	public static String readFile(File file) throws FileNotFoundException, IOException {
		// 전달받은 파일 객체를 읽어서 그 내용을 반환하는 메서드
		// 읽기 객체를 만들어서 파일 객체를 전달한다.
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);

		// 반복문을 이용해서 여러 줄을 읽어온다.
		// 읽어올 문자열을 임시로 담을 변수와 반환 문자열 변수 선언
		String line;
		String result = "";

		// 버퍼드리더를 이용해서 읽어온 내용을 line 변수에 담고
		// 그 값이 null값이 아니라면 반복 실행
		while ((line = br.readLine()) != null) {
			// 읽어온 내용을 출력
			System.out.println(line);
			// 읽어온 내용에 줄바꿈을 추가하여 반환문자열에 결합
			result += line + "\n";
		}

		br.close();

		return result;
	}

	public static void main(String[] args) {
//		입출력(Input/Output)
//		파일 입출력은 IOStream을 이용해
//		파일을 읽거나 쓰는 동작을 수행하는 것을 가리킨다.
//		텍스트 파일에 대한 IO 동작은 Buffered를 사용한다.
//		그 외의 미디어 파일의 경우, 바이너리 파일 형식이기 때문에
//		FileStream 클래스를 사용한다.

		File file = new File("test.txt");
		// 내용을 쓰는 작업 수행
//		writeFile(file);
		String result = "";
		try {
			result = readFile(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("result: " + result);

	}

}
