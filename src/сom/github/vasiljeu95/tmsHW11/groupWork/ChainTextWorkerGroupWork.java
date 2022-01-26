package сom.github.vasiljeu95.tmsHW11.groupWork;

import сom.github.vasiljeu95.tmsHW11.thirdTask.TextProcessable;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ChainTextWorkerGroupWork {

    private final TextProcessable[] processes;

    public ChainTextWorkerGroupWork(TextProcessable[] processes) {
        this.processes = processes;
    }

    String[] processText (String[] texts) {
        String[] inputArrayText = new String[texts.length];

        for (int i = 0; i < texts.length; i++) {
            inputArrayText[i] = processText(texts[i]);
        }

        return inputArrayText;
    }



    String processText(String input) {
        StringBuilder inputText = new StringBuilder(input);

        for (int i = 0; i < processes.length; i++) {
            try {
                processes[i].processText(inputText);
            } catch (UnsupportedOperationException e) {
                //NO Operation
            }
        }

        return inputText.toString();
    }
}
