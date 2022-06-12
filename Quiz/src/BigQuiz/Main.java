package BigQuiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		
		System.out.println("\tPlease enter your name!");
		String name = scan.nextLine();
		System.out.println("\t*Hello " + name + "! Welcome to Luke's Quiz!*");
		System.out.println("");

		int totalQuestions = 0;

		// Scanner scan2 = new Scanner(new
		// File("C:\\Users\\Dove\\Downloads\\PokemonQuestions.txt"));
		// while(scan2.hasNextLine()) {
		// String extquestion = scan2.nextLine();
		// String[] qanda = extquestion.split(",");
		// QuestionCard card = new QuestionCard(qanda[0],qanda[1]);
		List<QuestionCard> list = new QuestionDao().getQuestionList();
		for (int i = 0; i < list.size(); i++) {
			QuestionCard card = list.get(i);
			askQuestion(card);
			totalQuestions++;
		}

		System.out.println(
				"\tThank you for playing your score is **" + QuestionCard.answersCorrect + "/" + totalQuestions + "**");
		
		printAllQuestions();
		
	}

	private static void printAllQuestions() throws IOException {
		List<QuestionCard> list = new QuestionDao().getQuestionList();
		for (int i = 0; i < list.size(); i++) {
			QuestionCard card = list.get(i);
			System.out.println(card.question);
		}
	}

	public static void askQuestion(QuestionCard q) {
		System.out.println("\t" + q.question);
		String answer = scan.nextLine();

		if (answer.equalsIgnoreCase(q.answer)) {
			correctAnswer();
		} else {
			wrongsAnswer(q.answer);
		}
	}

	public static void correctAnswer() {
		System.out.println("\t*Congratulations that's correct!*");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println("");
		QuestionCard.answersCorrect++;
	}

	public static void wrongsAnswer(String answer) {
		System.out.println("\t Sorry that's incorrect, the correct answer is " + answer);
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println("");
	}

}
