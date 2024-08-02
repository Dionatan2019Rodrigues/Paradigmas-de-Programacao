package utilidade;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {
    public static void generateFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
