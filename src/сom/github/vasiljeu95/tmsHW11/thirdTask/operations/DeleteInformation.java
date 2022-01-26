package сom.github.vasiljeu95.tmsHW11.thirdTask.operations;

import сom.github.vasiljeu95.tmsHW11.thirdTask.TextProcessable;

public class DeleteInformation implements TextProcessable {
    int startIndexToDelete;
    int endIndexToDelete;

    public DeleteInformation(int startIndexToDelete, int endIndexToDelete) {
        this.startIndexToDelete = startIndexToDelete;
        this.endIndexToDelete = endIndexToDelete;
    }


    @Override
    public void processText(StringBuilder input) {
        input.delete(startIndexToDelete, endIndexToDelete);
    }
}
