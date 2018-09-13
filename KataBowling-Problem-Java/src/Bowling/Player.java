package Bowling;

public class Player {

	private int totalScores = 0;
	private int baseScores = 0;
	private int bonusScores = 0;
	private int currentStrikeQuantity = 0;
	private int currentSpareQuantity = 0;
	private int currentFrameNumber = 0;
	private int currentFirstRollScore = 0;
	
	private int frameTenFirstRoll = 0;
	private int frameTenSecondRoll = 0;
	private int frameTenRollsCounter = 0;

	private boolean isFirstRoll = true;

	private boolean gameOver = false;

	private static final int ALL_PINS = 10;
	private static final int FRAMES_QUANTITY=10;

	public void roll(int currentRollScore) {
		addBaseScores(currentRollScore);
		addBonusScores(currentRollScore);
		if (currentFrameNumber < FRAMES_QUANTITY-1) {
			if (isFirstRoll) {
				processFirstRollOfFirstNineFrames(currentRollScore);
			} 
			else {
				processSecondRollOfFirstNineFrames(currentRollScore);
			}
		}

		else if (currentFrameNumber == FRAMES_QUANTITY-1) {
			processLastFrame(currentRollScore);
		}
	}

	public void processLastFrame(int currentRollScore) {
		if (frameTenRollsCounter == 0) {
			frameTenFirstRoll = currentRollScore;
			frameTenRollsCounter++;
		} else if (frameTenRollsCounter == 1) {
			frameTenSecondRoll = currentRollScore;
			if (frameTenFirstRoll + frameTenSecondRoll < ALL_PINS) {
				gameOver = true;
			}
			frameTenRollsCounter++;
		} else if (frameTenRollsCounter == 2) {
			gameOver = true;
		}
	}

	public void processSecondRollOfFirstNineFrames(int currentRollScore) {
		if (currentFirstRollScore + currentRollScore == ALL_PINS) {
			currentSpareQuantity++;
		}
		isFirstRoll = true;
		currentFirstRollScore = 0;
		currentFrameNumber++;
	}

	public void processFirstRollOfFirstNineFrames(int currentRollScore) {
		if (currentRollScore == ALL_PINS) {
			currentStrikeQuantity++;
			currentFrameNumber++;
			currentFirstRollScore = 0;
		} else {
			currentFirstRollScore = currentRollScore;
			isFirstRoll = false;
		}
	}

	public void addBonusScores(int currentRollScore) {
		if (currentSpareQuantity > 0) {
			bonusScores = bonusScores + currentRollScore;
			currentSpareQuantity--;
		}
		if (currentStrikeQuantity > 0) {
			bonusScores = bonusScores + currentRollScore;
			currentStrikeQuantity--;
			currentSpareQuantity++;
		}
	}

	public void addBaseScores(int currentRollScore) {
		if (!gameOver) {
			baseScores = baseScores + currentRollScore;
		}
	}

	public int getTotalScores() {
		totalScores = baseScores + bonusScores;
		return totalScores;
	}

}
