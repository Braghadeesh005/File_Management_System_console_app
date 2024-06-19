import java.io.IOException;
import java.util.*;

public class Main{

    static List<Directory> directory_list = new ArrayList<>();
    static List<File> file_list = new ArrayList<>();
    static String curr_loc = "/home";

    public static void print_all_directories(){
        System.out.println("List of Directories");
        for(Directory i : directory_list){
            if(curr_loc == i.location && i.available == true){
                System.out.print(i.folder_name+" ");
            }
        }
        System.out.println();
    }

    public static void print_all_files() throws IOException{
        System.out.println("List of Files");
        for(File i : file_list){
            if(curr_loc == i.location && i.available == true){
                System.out.print(i.file_name+" ");
            }
        }
        System.out.println();
        String text = "hi";
        SaveFile s1 = new SaveFile("rab.text",text , true);
        s1.SaveToFile();
    }

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter 0 to create a directory and 1 to create a file and 2 to list all files and 3 to list all directories and anyother to exit");
            int input = sc.nextInt();
            if(input == 0){
                System.out.println("Enter Directory Name");
                String folder_name = sc.next();
                Directory curr_dir = new Directory(folder_name, curr_loc);
                directory_list.add(curr_dir);
                System.out.println("New directory successfully created");
            }
            else if(input == 1){
                System.out.println("Enter File Name");
                String file_name = sc.next();
                System.out.println("Enter File Content");
                String content = sc.next();
                File curr_file = new File(file_name, content, curr_loc);
                file_list.add(curr_file);
                System.out.println("New file successfully created");
            }
            else if(input == 2){
                try{
                print_all_files();
                }catch(Exception e){
                    System.out.print(e);
                }
            }
            else if(input == 3){
                print_all_directories();
            }
            else{
                System.out.println("Exitting app...");
                return;
            }
        }
    }
}