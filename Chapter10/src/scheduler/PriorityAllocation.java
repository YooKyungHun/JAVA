package scheduler;

public class PriorityAllocation implements Scheduler{
	
	@Override
	public void getNextCall() {
		System.out.println("고객의 등급이 가장 높은 고객의 전화를 먼져 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무스킬이 가장 높은 상담원의 대기열에 앞에 우선 배분합니다.");
	}

}
