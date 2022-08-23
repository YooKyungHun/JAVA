package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		// inputValue: R, L, P
		System.out.println("전화 상담 배분방식을 선태갛세요. R, L, P");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if ( ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if ( ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if ( ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
		// 입력값에 따라 인터페이스를 구현한 각각의 인스턴스가 assign 되고,
		// 메서드가 호출되는 것.
		// 같은 메서드를 불러도 각 인스턴스에 따라 구현부분이 달라지는 것 -> 다형성
	}

}
