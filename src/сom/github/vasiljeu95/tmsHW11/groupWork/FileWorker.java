package сom.github.vasiljeu95.tmsHW11.groupWork;

import сom.github.vasiljeu95.tmsHW11.groupWork.textEntity.TextEntity;
import сom.github.vasiljeu95.tmsHW11.groupWork.textEntity.TextEntityStorage;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileWorker {

    TextEntityStorage readTextEntityStorage (String fileName) throws SerialNumberException {
        TextEntity[] entinyArray = null;

        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            entinyArray = (TextEntity[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (TextEntity textEntity : entinyArray) {
            if (textEntity.getSerialNumber() < 0) {
                throw new SerialNumberException("Serial number cannot be negative.");
            }
        }
        return new TextEntityStorage();
    }

    public static void writeTexts (String[] texts, String fileName) {
        try (FileWriter writer = new FileWriter (fileName)) {
            for (String text : texts) {
                writer.write(text);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
