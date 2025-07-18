package view;

import controller.QuestionController;
import model.User;

import java.util.Scanner;

public class GameMasterView {
    //TODO NEED TO WORK
    public static void show(User user){
        Scanner input = new Scanner(System.in);
        QuestionController questionController = new QuestionController();
        int option = 0;
        System.out.println("Welcome Master");
        System.out.println("Enter 1: Create a new question");
        System.out.println("Enter 2: Update a question");
        System.out.println("Enter 3: View Questions");
        System.out.println("Enter 4: Test Quiz");
        System.out.println("Enter 5: Delete Questions");
        System.out.println("Enter 6: Log Out");
        option = Integer.parseInt(input.nextLine());
        if(option > 0){
            if(option == 1){
                questionController.createQuestion();
            }
            else if(option == 2)
            {
                questionController.editQuestion();
            }
            else if(option == 3)
            {
                questionController.listQuestions();
            }
            else if(option == 4)
            {
                questionController.startGame(user);
            }
            else if(option == 5)
            {
                questionController.deleteQuestion();
            }
            else if(option == 6){
                System.out.println("Exiting");
            }
            else{
                System.out.println("Invalid option");
            }
        }else{
            System.out.println("Choose the options from 1 to 5");
        }
    }
}
