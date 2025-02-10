package day07.streamAPI.practice;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	// 필기 점수를 담을 리스트
	List<Integer> scoreWritten;
	
	// 실기 점수
	Integer scorePractical;
	
	// 수험생 이름
	String name;
	
	public Student(String name, List<Integer> written, Integer practical) {
		this.name = name;
		this.scoreWritten = written;
		this.scorePractical = practical;
	}
	
}
