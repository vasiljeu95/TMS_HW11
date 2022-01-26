package сom.github.vasiljeu95.tmsHW11.thirdTask.operations;

import сom.github.vasiljeu95.tmsHW11.thirdTask.TextProcessable;

public class InsertInformation implements TextProcessable {
    String stringToInsert;
    int insertionIndex;

    public InsertInformation(String stringToInsert, int insertionIndex) {
        this.stringToInsert = stringToInsert;
        this.insertionIndex = insertionIndex;
    }

    @Override
    public void processText(StringBuilder input) {
        input.insert(insertionIndex, stringToInsert);
    }
}
