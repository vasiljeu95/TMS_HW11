package сom.github.vasiljeu95.tmsHW11.groupWork.operatorsGroupWork;

import сom.github.vasiljeu95.tmsHW11.groupWork.processable.TextProcessableGroupWork;

public class ReplaceInformationGroupWork implements TextProcessableGroupWork {
    String objectToReplace;
    int startIndexToReplace;
    int endIndexToReplace;

    public ReplaceInformationGroupWork(String objectToReplace, int startIndexToReplace, int endIndexToReplace) {
        this.objectToReplace = objectToReplace;
        this.startIndexToReplace = startIndexToReplace;
        this.endIndexToReplace = endIndexToReplace;
    }

    @Override
    public void processText(StringBuilder input) {
        input.replace(startIndexToReplace, endIndexToReplace, objectToReplace);
    }
}
