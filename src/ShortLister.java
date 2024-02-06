// ShortLister.java
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ShortLister {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                List<String> lines = Files.readAllLines(selectedFile.toPath());
                String[] words = lines.stream().flatMap(line -> List.of(line.split("\\s+")).stream()).toArray(String[]::new);

                Filter shortWordFilter = new ShortWordFilter();
                ArrayList<String> shortWords = CollectAll.collectAll(words, shortWordFilter);

                System.out.println("Short words < 5:");
                for (String word : shortWords) {
                    System.out.println(word);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
