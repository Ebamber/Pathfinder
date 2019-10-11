import entities.Directory;
import entities.PrimitiveFile;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class TestDU {

    private final String pathToDirectory = "C:\\Users\\Edward\\IdeaProjects\\Pathfinder\\src\\main\\resources\\testDir";

    @Test
    public void shouldGetAllDirs(){
        entities.File[] files = new entities.File[0];
        try {
            files = DuUtils.getDirectory(pathToDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
        entities.File[] testAgainst = new entities.File[] {
                new Directory(pathToDirectory + "\\subDir"),
                new PrimitiveFile(pathToDirectory + "\\test1"),
                new PrimitiveFile(pathToDirectory + "\\test2")
        };

        Assert.assertEquals(testAgainst.length, files.length);
        for (int counter = 0; counter < files.length; counter++)
        {
            Assert.assertEquals(testAgainst[counter].getPath(), files[counter].getPath());
        }
    }

    @Test
    public void shouldSortAllDirs(){
        entities.File[] files = new entities.File[0];
        try {
            files = DuUtils.getDirectory(pathToDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
        files = DuUtils.sort(files);
        entities.File[] testAgainst = new entities.File[] {
                new PrimitiveFile(pathToDirectory + "\\test2"),
                new Directory(pathToDirectory + "\\subDir"),
                new PrimitiveFile(pathToDirectory + "\\test1")
        };

        Assert.assertEquals(testAgainst.length, files.length);
        for (int counter = 0; counter < files.length; counter++)
        {
            Assert.assertEquals(testAgainst[counter].getPath(), files[counter].getPath());
        }
    }


}
