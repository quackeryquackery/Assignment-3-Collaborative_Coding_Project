public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String makeMove();
}
class HumanPlayer extends Player
{
    public HumanPlayer(String name)
    {
        super(name);
    }

    @Override
    public String makeMove() {
        //Move("Human");
        return "";
    }
}

class ComputerPlayer extends Player
{
    public ComputerPlayer(String name)
    {
        super(name);
    }
    @Override
    public String makeMove() {
        //Move("AI");
        return "";
    }
}

class RandomPlayer extends Player
{
    public RandomPlayer(String name)
    {
        super(name);
    }
    @Override
    public String makeMove() {
        //Move("Random");
        return "";
    }
}

class PlayerFactory {
    public static Player createPlayer(String type, String name) {
        if (type.equalsIgnoreCase("Human")) {
            return new HumanPlayer(name);
        }
        else if (type.equalsIgnoreCase("AI")) {
            return new ComputerPlayer(name);
        }
        else if (type.equalsIgnoreCase("Random Player")) {
            return new RandomPlayer(name);
        }
        else {
            throw new IllegalArgumentException("Unknown player type: " + type);
        }
    }
}

