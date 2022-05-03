package homeOOP5;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File folderIn = new File("C:\\Users\\ANDREY\\Desktop\\Новая папка\\java ООП"); 
		File folderOut = new File("lecture");
		String ext = ".pdf";
		folderOut.mkdir();
		try {
			FileService.copyFolder(folderIn, folderOut, ext);
		System.out.println("dfssdfsdf");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
