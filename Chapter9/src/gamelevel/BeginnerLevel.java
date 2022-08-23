package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump 할 줄 몰라.");
	}

	@Override
	public void turn() {
		System.out.println("turn 할 줄 몰라.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** Beginner 레벨 입니다. *****");

	}

}
