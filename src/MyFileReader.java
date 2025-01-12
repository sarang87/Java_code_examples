import java.io.File;
import java.util.Scanner;


public abstract class MyFileReader {
    protected File file;
    protected String fileType;
    protected long size;

    public MyFileReader(File file) {
        this.file = file;
        this.size = 0;
        this.fileType = determineFileType();
    }

    // Abstract method to be implemented by subclasses to read the file
    public abstract void readFile();

    // Method to calculate the size of the file
    public void calculateSize() {
        if (file.exists() && file.isFile()) {
            this.size = file.length();
        } else {
            throw new IllegalArgumentException("Invalid file: " + file.getPath());
        }
    }

    // Method to determine the type of the file
    private String determineFileType() {
        String fileName = file.getName();
        if (fileName.contains(".")) {
            return fileName.substring(fileName.lastIndexOf('.') + 1);
        }
        return "unknown";
    }

    // Getters for size and fileType
    public long getSize() {
        return size;
    }

    public String getFileType() {
        return fileType;
    }


}
