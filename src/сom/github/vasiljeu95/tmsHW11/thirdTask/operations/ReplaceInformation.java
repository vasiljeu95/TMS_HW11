package сom.github.vasiljeu95.tmsHW11.thirdTask.operations;

import сom.github.vasiljeu95.tmsHW11.thirdTask.TextProcessable;

public class ReplaceInformation implements TextProcessable {
    String objectToReplace;
    int startIndexToReplace;
    int endIndexToReplace;

    public ReplaceInformation(String objectToReplace, int startIndexToReplace, int endIndexToReplace) {
        this.objectToReplace = objectToReplace;
        this.startIndexToReplace = startIndexToReplace;
        this.endIndexToReplace = endIndexToReplace;
    }

    @Override
    public void processText(StringBuilder input) {
        input.replace(startIndexToReplace, endIndexToReplace, objectToReplace);
    }
}
