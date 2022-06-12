package BigQuiz;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class for getting and storing question cards from file
 */
public class QuestionDao {

	// Storing question cards
	private static List<QuestionCard> questionsList;

	public List<QuestionCard> getQuestionList() throws IOException {
		if (questionsList == null) {
			questionsList = new ArrayList<>();
			Scanner scan2 = new Scanner(new File("C:\\Users\\Dove\\Downloads\\PokemonQuestions.txt"));
			while (scan2.hasNextLine()) {
				String extquestion = scan2.nextLine();
				String[] qanda = extquestion.split(",");
				QuestionCard card = new QuestionCard(qanda[0], qanda[1]);
				questionsList.add(card);
			}
			return questionsList;
		}
		else {
			return questionsList;
		}
	}

}
