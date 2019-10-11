package entities;

public class FileFactory {
    public static File returnFile(java.io.File file){
        if(file.isDirectory()) {
            return new Directory(file.getPath());
        }
        else{
            return new PrimitiveFile(file.getPath());
        }
    }

}
