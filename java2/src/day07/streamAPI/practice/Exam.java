package day07.streamAPI.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exam {

	public static void main(String[] args) {
		
		// 직접 데이터를 입력한 배열을 생성
		Student[] studentsArr = new Student[] {
				new Student("정이준",	List.of(45,60,50,75,85),90),
				new Student("안도윤",	List.of(80,40,65,75,55),70),
				new Student("김하준",	List.of(50,65,70,80,40),75),
				new Student("고은우",	List.of(60,45,75,70,45),65),
				new Student("백서준",	List.of(55,80,55,90,50),60),
				new Student("김서아",	List.of(90,85,90,65,50),60),
				new Student("윤이서",	List.of(35,55,80,70,45),80),
				new Student("박아윤",	List.of(50,40,75,70,60),65),
				new Student("이지아",	List.of(70,90,60,85,70),55),
				new Student("정하윤",	List.of(80,65,60,80,70),80)
		};
		
		// 배열의 데이터를 리스트 형태로 변환		
		List<Student> students = Arrays.asList(studentsArr);
		
		// 1. 필기 점수의 평균을 구하고
		students
			.stream()
			.filter(
				(e)-> {
					// 필기 점수를 스트림 형태로 변환
					Stream<Integer> scores = e.scoreWritten.stream();
					double avg = scores.collect(Collectors.averagingInt(e2->e2));
					// 평균 점수가 60점 이상인 학생의 
					return avg >= 60;
				}
			)
		// 이름 출력
//		.forEach(e->System.out.println(e.name))
		;
		
		// 2. 필기 점수 중 하나라도 40점 미만인 학생의 이름 출력
		students
			.stream()
			.filter((e)->{
				// 학생의 필기 점수를
				return e.scoreWritten
						.stream() // 스트림으로 변환 후
						// 하나라도 40점 미만이면 true 반환
						.anyMatch(score-> score < 40);
			})
			.map(e->e.name) // 학생의 이름을 스트림으로 변환
//			.forEach(System.out::println) // 윤이서
		;
		
		// 3. 필기, 실기 통합 모든 점수가 60점 이상인 학생 수 출력
		Stream<Student> prob3 = students.stream()
			.filter((e)->{
				int min = e.scoreWritten.stream()
					.collect(Collectors
							.minBy(Comparator.comparingInt(e2->e2))
							)
					.get();
				// 두 값을 전달받았을 때, 더 작은 값을 반환
				// 필기점수의 가장 작은 값과 실기 점수를 비교해서
				// 더 작은 값이 60 이상이면
				// 모든 점수가 60점 이상이라는 의미가 된다.
				return Math.min(min, e.scorePractical) >= 60;
			})
		;
		// 해당 학생 이름 확인
//		prob3.forEach(e -> System.out.println(e.name));
		
		// 학생 수 확인
		long count = prob3.count();
		System.out.println("문제3. 모든 점수의 최소값이 "
				+ "60점 이상인 학생의 수: \n" + count);
		
	}

}
