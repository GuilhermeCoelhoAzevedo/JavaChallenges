package leetCode;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class ListOfFiles {
    public static Collection<File> getListOfFiles(File startingDirectory) {
        List<File> result = new ArrayList<>();
        Path startPath = Paths.get(startingDirectory.getPath());

        try (Stream<Path> stream = Files.walk(startPath)){
            stream
            .filter(Files::isRegularFile)
            .forEach(path -> {
                result.add(path.toFile());
            });
        } catch (IOException e){
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        File file = new File("C:\\TrainingCourses\\Workshops");
        Collection<File> result = ListOfFiles.getListOfFiles(file);
        System.out.println(result);
    }
}
