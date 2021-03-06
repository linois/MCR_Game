package Card;

import ModelClasses.Macro;
import ModelClasses.Invocator;

public class Card implements Invocator {
    private Macro command;
    private String name;
    private int cost;
    private CardType type;

    public Card(String name, CardType type, int cost) {
        this.type = type;
        this.name = (type != null ? type.toString() + " " : "") + name;
        this.cost = cost;
    }

    public void play() {
        command.execute();
    }

    @Override
    public void setCommand(Macro command) {
        this.command = command;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public CardType getType() {
        return type;
    }
}
