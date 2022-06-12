package BigQuiz;

public class QuestionCard {

	public String question;
	public String answer;
	public static int answersCorrect=0;
	
	public QuestionCard(String quest, String ans) {
		this.question=quest;
		this.answer=ans;
	}
}