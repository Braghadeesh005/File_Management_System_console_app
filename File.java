public class File{

    String file_name;
    String content;
    String location;
    boolean available = true;

    public File(String file_name, String content, String location){
        this.file_name = file_name;
        this.content = content;
        this.location = location;
    }
}