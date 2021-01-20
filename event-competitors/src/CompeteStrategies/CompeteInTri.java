package CompeteStrategies;

import java.util.ArrayList;

public class CompeteInTri implements CompeteStrategy {
    public void compete(String name, ArrayList<String> resultList) {
        resultList.add(name + " is competing in the run.");
    }
}
