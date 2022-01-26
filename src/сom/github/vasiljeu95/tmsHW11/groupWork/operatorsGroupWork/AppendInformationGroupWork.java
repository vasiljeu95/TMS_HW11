package сom.github.vasiljeu95.tmsHW11.groupWork.operatorsGroupWork;

import сom.github.vasiljeu95.tmsHW11.groupWork.TextProcessableGroupWork;

public class AppendInformationGroupWork implements TextProcessableGroupWork {
    String insertAtTheEnd;

    public AppendInformationGroupWork(String insertAtTheEnd) {
        this.insertAtTheEnd = insertAtTheEnd;
    }

    @Override
    public void processText(StringBuilder input) {
        input.append(insertAtTheEnd);
    }
}
