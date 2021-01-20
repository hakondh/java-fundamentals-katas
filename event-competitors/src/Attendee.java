import CompeteStrategies.CompeteStrategy;

import java.util.ArrayList;

public class Attendee{
    String name;
    CompeteStrategy cb;
    String type;

    public Attendee(String name, CompeteStrategy cb, String type) {
        this.name = name;
        this.cb = cb;
        this.type = type;
    }

    public void startCompeting(ArrayList<String> resultList) {
        cb.compete(name, resultList);
    }

    public void render(){
        System.out.println("Hi, I am " + (type.equals("Athlete") ? "an " : "a ") + type + ", and my name is " + name);
    }
}
