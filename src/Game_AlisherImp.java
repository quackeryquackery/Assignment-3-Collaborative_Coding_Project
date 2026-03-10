import java.util.Scanner;

public class Game
{
    private int roundCounter;
    RuleEngine engine = new RuleEngine();
    Player human = PlayerFactory.createPlayer("Human", "You");
    Player computer = PlayerFactory.createPlayer("AI", "Computer");

    public Game()
    {
        this.roundCounter = 1;
    }

    private void nextRound()
    {
        this.roundCounter++;
    }

    public void play()
    {
        Scanner input = new Scanner(System.in);

        while (this.roundCounter <= 20)
        {
            System.out.print("Round " + this.roundCounter + " - Choose " + engine.availableChoices() + ": ");
            int choice = input.nextInt();
            System.out.println("You chose >> "+engine.selection(choice));
            nextRound();
        }
        System.out.println("Game over");
    }
}
