public abstract class Player {
    protected String name;
    protected boolean hiddenStatus;

    public Player(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void updateHidden(boolean val)
    {
        hiddenStatus = val;
    }

    public abstract String makeMove();
}
class HumanPlayer extends Player
{
    public HumanPlayer(String name)
    {
        super(name);
    }

    public String makeMove()
    {
        return Move.makeHumanDecision(hiddenStatus);
    }
}

class ComputerPlayer extends Player
{
    public ComputerPlayer(String name)
    {
        super(name);
    }
    public String makeMove()
    {
        return Move.makeComputerDecision();
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
        //Add other player types as necessary...
        else {
            throw new IllegalArgumentException("Unknown player type: " + type);
        }
    }
}
