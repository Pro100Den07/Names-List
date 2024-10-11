package app;

import java.util.List;

public class DataHandler {

    // Метод формує виведення імені за певним індексом
    public String formOutput(List<String> names, int index) {
        if (index >= 0 && index < names.size()) {
            return "Name: " + names.get(index) + " is in index " + index;
        } else {
            return "Wrong index!";
        }
    }

    // Метод формує виведення нумерованого списку імен
    public String formListOutput(List<String> names) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNames:\n");
        for (int i = 0; i < names.size(); i++) {
            sb.append((i + 1) + ") " + names.get(i) + "\n");
        }
        return sb.toString();
    }
}