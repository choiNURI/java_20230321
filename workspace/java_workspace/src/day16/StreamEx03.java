package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx03 {

	
	public static void main(String[] args) {
	
	ArrayList<Student> list = new ArrayList<>();
	
	list.add(new Student("윤민영",2));
	list.add(new Student("최누리",100));
	list.add(new Student("최수정",5));
	list.add(new Student("유하민",20));
	list.add(new Student("남예준",98));
	list.add(new Student("채봉구",12));
	
	/*list로 스트림 생성 후 
	이름:점수 출력
	점수 합계출력*/
	
	//Class에 toString이 존재할떄 출력
	list.stream().forEach(System.out::println);
	
	System.out.println("--------------");
	 
	//toString이 없을때는 
	// {} : 처리구문이 많은 경우
	list.stream().forEach(s->{  //s=>new Student("홀길동",100)
		String name = s.getName(); //"홍길동"
		int score = s.getScore();  //90
		System.out.println(name+":"+score);
	});
	
	
	//합계 => intStream
	//getScore() => Integer => int 변환
	//추출 => map, 추출해서 int변환 => mapToint
	
	
	int sum = list.stream().mapToInt(n->n.getScore()).sum();
	
	System.out.println("--------------");	
	Stream<Student> s = list.stream();
	int sSum = s.mapToInt(n->n.getScore()).sum();
	
	
	
	//개수
	//.count()의 리턴타입은 long이다.
	long cnt = list.stream().count();
	System.out.println("합계:"+sum+", 총 인원:"+cnt);
	
	
	
	//점수가 70점 이상인 친구들의 합계
	int sss = list.stream().mapToInt(z->z.getScore()).filter(z->z>=70).sum();
	System.out.println("70점 이상 합계 : "+sss);
	
	
	

	
	
	
	
	//OptionalDouble avg = list.stream().mapToDouble(n->n.getScore()).average();
	//System.out.println(avg);
	//System.out.printf("~ 평  균 : %.2f",(double)sSum/cnt);
	

	
	
	
	}
	
}
