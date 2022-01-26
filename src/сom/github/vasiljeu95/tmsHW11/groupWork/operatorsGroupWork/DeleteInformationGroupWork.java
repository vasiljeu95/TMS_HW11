package сom.github.vasiljeu95.tmsHW11.groupWork.operatorsGroupWork;

import сom.github.vasiljeu95.tmsHW11.groupWork.TextProcessableGroupWork;

public class DeleteInformationGroupWork implements TextProcessableGroupWork {
    int startIndexToDelete;
    int endIndexToDelete;

    public DeleteInformationGroupWork(int startIndexToDelete, int endIndexToDelete) {
        this.startIndexToDelete = startIndexToDelete;
        this.endIndexToDelete = endIndexToDelete;
    }

    @Override
    public void processText(StringBuilder input) {
        input.delete(startIndexToDelete, endIndexToDelete);
    }
}
