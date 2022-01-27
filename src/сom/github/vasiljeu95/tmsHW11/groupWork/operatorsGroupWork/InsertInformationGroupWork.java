package сom.github.vasiljeu95.tmsHW11.groupWork.operatorsGroupWork;

import сom.github.vasiljeu95.tmsHW11.groupWork.processable.TextProcessableGroupWork;

public class InsertInformationGroupWork implements TextProcessableGroupWork {
    String stringToInsert;
    int insertionIndex;

    public InsertInformationGroupWork(String stringToInsert, int insertionIndex) {
        this.stringToInsert = stringToInsert;
        this.insertionIndex = insertionIndex;
    }

    @Override
    public void processText(StringBuilder input) {
        input.insert(insertionIndex, stringToInsert);
    }
}
