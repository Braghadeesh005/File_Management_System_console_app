import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveFile {

    String filename;
    String text;
    boolean isAppend;
    
    public SaveFile(String filename, String text, boolean isAppend){
        this.filename = filename;
        this.text = text;
        this.isAppend = isAppend;
    }

    public void SaveToFile() throws IOException{
        File file1 = new File(filename);
        FileWriter fw = new FileWriter(file1, isAppend);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(text);
        pw.close();
    } 
    
}
