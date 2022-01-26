package сom.github.vasiljeu95.tmsHW11.groupWork;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

public class WriteObject {
    public static void main(String[] args) {
//        TextEntity[] entities = {
//                new TextEntity(4, "firstText"),
//                new TextEntity (1, "secondText"),
//                new TextEntity (3, "thirdText"),
//                new TextEntity(5, "fourthText")
//        };
        TextEntity[] entities = generateTextEntity(4);

        try {
            FileOutputStream fos = new FileOutputStream("entities.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(entities);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < entities.length; i++) {
            System.out.println(entities[i]);
        }
    }

    static TextEntity[] generateTextEntity (int countOfEntity) {
        TextEntity[] entities = new TextEntity[countOfEntity];
        Random newRandom = new Random();
        Random forRandomText = new Random();

        String[] textForGenerate = {"one", "two", "three", "fou", "A", "B", "C", "D", "car", "Engine", "Bolter"};

        for (int i = 0; i < countOfEntity; i++) {
            String textOne = textForGenerate[forRandomText.nextInt(0, 10)];
            String textTwo = textForGenerate[forRandomText.nextInt(0, 10)];;
            String text = textOne + textTwo;

            entities[i] = new TextEntity(newRandom.nextInt(1, 100), text);
        }

        return entities;
    }
}
