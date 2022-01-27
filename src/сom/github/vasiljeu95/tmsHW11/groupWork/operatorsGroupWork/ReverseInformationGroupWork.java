package сom.github.vasiljeu95.tmsHW11.groupWork.operatorsGroupWork;

import сom.github.vasiljeu95.tmsHW11.groupWork.processable.TextProcessableGroupWork;

public class ReverseInformationGroupWork implements TextProcessableGroupWork {
    public ReverseInformationGroupWork() {
    }

    @Override
    public void processText(StringBuilder input) {
        input.reverse();
    }
}
