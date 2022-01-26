package сom.github.vasiljeu95.tmsHW11.thirdTask.operations;

import сom.github.vasiljeu95.tmsHW11.thirdTask.TextProcessable;

public class ReverseInformation implements TextProcessable {
    public ReverseInformation() {
    }

    @Override
    public void processText(StringBuilder input) {
        input.reverse();
    }
}
