package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	boolean gameOver = true;
	int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your High score is " + highScore);

    score = 10000;
    levelCompleted = 8;
    bonus = 200;

    highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your High score is " + highScore);

//    int john = calculateHighScorePosition(1500);
    displayHighScorePosition( "John ", calculateHighScorePosition(1500) );

    displayHighScorePosition( "Lucy ", calculateHighScorePosition(900) );

    displayHighScorePosition( "Hana ", calculateHighScorePosition(400) );

    displayHighScorePosition( "Danny ", calculateHighScorePosition(50) );
    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver = true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition( String playerName, int position) {
        System.out.println( playerName + " got to position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition( int score ) {

        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if ( score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
