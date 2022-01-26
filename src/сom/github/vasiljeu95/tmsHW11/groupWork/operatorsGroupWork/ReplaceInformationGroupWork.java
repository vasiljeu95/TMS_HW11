package сom.github.vasiljeu95.tmsHW11.groupWork.operatorsGroupWork;

import org.w3c.dom.Text;
import сom.github.vasiljeu95.tmsHW11.groupWork.TextProcessableGroupWork;

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
