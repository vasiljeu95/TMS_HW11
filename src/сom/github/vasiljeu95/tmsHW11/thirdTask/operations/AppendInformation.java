package сom.github.vasiljeu95.tmsHW11.thirdTask.operations;

import сom.github.vasiljeu95.tmsHW11.thirdTask.TextProcessable;

public class AppendInformation implements TextProcessable {
    String insertAtTheEnd;

    public AppendInformation(String insertAtTheEnd) {
        this.insertAtTheEnd = insertAtTheEnd;
    }

    @Override
    public void processText(StringBuilder input) {
        input.append(insertAtTheEnd);
    }
}
