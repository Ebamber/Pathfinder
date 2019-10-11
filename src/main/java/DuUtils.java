import entities.File;
import entities.FileFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class DuUtils {
    public static File[] getDirectory(String path) throws IOException {
        /*
        File[] returnable = new File[file.listFiles().length];
        int i = 0;
        for(java.io.File child : file.listFiles()){
            returnable[i] = new FileFactory().returnFile(child);
            i++;
        }
        return returnable;
        */
        return Files.list(Paths.get(path)).map(a -> FileFactory.returnFile(new java.io.File(a.toString()))).toArray(File[]::new);
        //return Files.walk(Paths.get(path)).map(a -> FileFactory.returnFile(new java.io.File(path))).toArray(File[]::new);
    }

    public static File[] sort(File[] files) {
        return Arrays.stream(files).sorted(Comparator.comparingLong(File::getSize).reversed()).toArray(File[]::new);
    }
}
