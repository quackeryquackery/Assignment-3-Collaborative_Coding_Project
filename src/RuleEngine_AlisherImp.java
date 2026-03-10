import java.util.LinkedHashMap;
import java.util.Map;

public class RuleEngine
{
    private static final LinkedHashMap<Integer, String> possibleChoices = new LinkedHashMap<>();

    public RuleEngine()
    {
        possibleChoices.put(1, "Rock");
        possibleChoices.put(2, "Paper");
        possibleChoices.put(3, "Scissors");
        // Add choices as need be...
    }

    public String availableChoices()
    {
        String output = "(";
        for (Integer key : possibleChoices.keySet())
        {
            output = output.concat(key+"="+possibleChoices.get(key)+", ");
        }
        output = output.substring(0, output.length() - 2); // Remove trailing comma
        output = output.concat(")");
        return output;

        // Currently returns >> (1=Rock, 2=Paper, 3=Scissors)
    }

    public String selection(int choice)
    {
        return possibleChoices.get(choice);
        // If user inputs 1, returns Rock, and so on...
    }



    public void getVictor(String firstPlayer, String secondPlayer)
    {

    }
}
