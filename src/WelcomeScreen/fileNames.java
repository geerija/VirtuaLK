package WelcomeScreen;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;

public class fileNames implements Show {
    private Folder f1 = new Folder();
    private ArrayList<String> a1 = new ArrayList<>();

    public fileNames() {
        a1.add("1. ADD A FILE");
        a1.add("2. DELETE A FILE");
        a1.add("3. SEARCH A FILE");
        a1.add("4. RETURN TO LIST");
    }

    public void DisplayShow() {
        System.out.println("File Options Menu");
        for (String v1 : options) {
            System.out.println(v1);
        }
    }

    public void FetchInput() {
        int selectedOption;
        while ((selectedOption = this.getOption()) != 4) {
            this.NavigateOption(selectedOption);
        }
    }

    public void NavigateOption(int option) {
        switch (option) {
            case 1:
                this.AddFile();
                this.DisplayShow();
                break;
            case 2:
                this.DeleteFile();
                this.DisplayShow();
                break;
            case 3:
                this.SearchFile();
                this.DisplayShow();
                break;
            default:
                System.out.println("Selected choice not available");
                break;
        }
    }

    public void AddFile() {
        System.out.println("Please Enter the Filename:");
        String fileName = this.getInputString();
        System.out.println("you are adding a file named:" + fileName);
        try {
            Path path = FileSystems.getDefault().getPath(Folder.name + fileName).toAbsolutePath();
            File file = new File(f1.getName() + fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
                f1.getFiles().add(file);
            } else {
                System.out.println("This File Already Exits, no need to add another");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void DeleteFile() {
        System.out.println("Please Enter the Filename:");
        String fileName = this.getInputString();
        System.out.println("You are deleting a file named: " + fileName);
        Path path = FileSystems.getDefault().getPath(Folder.name + fileName).toAbsolutePath();
        File file = path.toFile();
        if (file.delete()) {
            System.out.println("Deleted File: " + file.getName());
            f1.getFiles().remove(file);
        } else {
            System.out.println("Failed to delete file:" + fileName + ", file was not found.");
        }
    }

    public void SearchFile() {


    }
}

