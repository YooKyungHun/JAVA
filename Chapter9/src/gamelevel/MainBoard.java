package gamelevel;

public class MainBoard {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

	//	***** Beginner 레벨 입니다. *****
	//	천천히 달립니다.
	//	jump 할 줄 몰라.
	//	turn 할 줄 몰라.
	//	***** Advanced 레벨 입니다. *****
	//	빨리 달립니다.
	//	높이 jump 합니다.
	//	높이 jump 합니다.
	//	turn 할 줄 몰라.
	//	***** Super 레벨 입니다. *****
	//	엄청 빨리 달립니다.
	//	엄청 높이 jump 합니다.
	//	엄청 높이 jump 합니다.
	//	엄청 높이 jump 합니다.
	//	한 바퀴 돕니다.

	
}
