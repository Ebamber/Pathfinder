import entities.File;

import java.io.IOException;

public class DU {
    public static void main (String[] args){
        try {
            File[] files = DuUtils.sort(DuUtils.getDirectory(args[0]));
            for(File file : files){
                System.out.println(file.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
