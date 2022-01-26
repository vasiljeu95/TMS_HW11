package сom.github.vasiljeu95.tmsHW11.thirdTask;

public class ChainTextWorker {

    TextProcessable[] processes;

    public ChainTextWorker(TextProcessable[] processes) {
        this.processes = processes;
    }

    String processText(String input) {
        StringBuilder inputText = new StringBuilder(input);

        for (int i = 0; i < processes.length; i++) {
            processes[i].processText(inputText);
        }

        return inputText.toString();
    }
}
