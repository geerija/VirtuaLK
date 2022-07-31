package MainDirectory;

import appStorage.Folder;

import java.io.File;

public class FolderMain {
    private static Folder file1=new Folder();
    public static void PrintFiles()
    {
        file1.fillFiles();
        boolean file;
        for ((File file: FolderMain.getFileFolder().getFiles())
        {
            System.out.println(file.getName());
        }

    }
    public static FOL getFileFolder()
    {
        return file1;
    }
    public static void SetFileDirectory(FOL file1)
    {
        FolderMain.file1 =file1;
    }
}
