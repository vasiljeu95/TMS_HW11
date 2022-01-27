package сom.github.vasiljeu95.tmsHW11.groupWork.textEntity;

import java.util.Comparator;

public class TextEntityComparator implements Comparator<TextEntity> {

    @Override
    public int compare(TextEntity te1, TextEntity te2) {
        if (te1.getSerialNumber() > te2.getSerialNumber()) {
            return 1;
        } else if (te1.getSerialNumber() < te2.getSerialNumber()) {
            return -1;
        }
        return 0;
    }
}
