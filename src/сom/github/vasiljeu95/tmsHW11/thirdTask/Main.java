package сom.github.vasiljeu95.tmsHW11.thirdTask;

import сom.github.vasiljeu95.tmsHW11.thirdTask.operations.AppendInformation;
import сom.github.vasiljeu95.tmsHW11.thirdTask.operations.InsertInformation;
import сom.github.vasiljeu95.tmsHW11.thirdTask.operations.ReverseInformation;

public class Main {
    public static void main(String[] args) {
//        System.out.println("do you want to reverse your future text? y or n");
//
//        Scanner sc = new Scanner(System.in);
//        String choice = sc.nextLine();
//
//        if (choice.equals("y")) {
//
//        }

        String text = " kraD";

        ChainTextWorker worker = new ChainTextWorker(new TextProcessable[] {
                new ReverseInformation(),
                new AppendInformation("Angels!!! "),
                new InsertInformation("Vladik like is ", 0)
        });

        String test = worker.processText(text);
        System.out.println(test);
    }
}
