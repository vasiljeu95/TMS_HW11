package сom.github.vasiljeu95.tmsHW11.groupWork;

import java.io.Serializable;

public class TextEntity implements Serializable {
    private int serialNumber;
    private String text;

    public TextEntity(int serialNumber, String text) {
        this.serialNumber = serialNumber;
        this.text = text;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "serialNumber =" + serialNumber + ", text='" + text;
    }
}
