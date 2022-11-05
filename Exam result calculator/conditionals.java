public class Conditionals{
    public static void main(String[] args){

	/**************** Student Score Data ******************/
	//student name 
	String name = "Melvin Agutsin";
	
	//Correct Answers 
	int correctAnswers = 19;

	//over all questionare count
        int over = 20;	
	
	//(must) passing percentage
	int passing  = 80;
	
	/**************** Test mode (correct minus wrong mode or normal mode) ******************/
	boolean correctMinusWrong = false;

	/**************** Result Data ******************/
	//Wrong Anwers
	int wrongAnswers = over - correctAnswers;
	
	//get final Score using ternery oprator
	int finalScore = correctMinusWrong ? correctAnswers - wrongAnswers : correctAnswers;

	/**************** Grading ******************/
	
	//student percentage
	float percentage = ((float) finalScore) / over;
	float scoreAverage = percentage * 100;

	//status
	String status = scoreAverage >= passing ? "PASS" : "FAILED";
 	
	/**************** Output ******************/
	System.out.println("***************** Result ****************");
	System.out.println("name: "+ name);
	System.out.println("Correct Answers: "+ correctAnswers);
	System.out.println("Wrong answers: "+ wrongAnswers);
	System.out.println("Final score: "+ finalScore);
	System.out.println("Score average: "+ ((int)scoreAverage)+"%");
	
	System.out.println("Test count: "+ over);
	System.out.println("passing average: "+ passing+"%");
	System.out.println("Text Status: "+ status);
	
  };	
}













