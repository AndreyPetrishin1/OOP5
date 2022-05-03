package homeOOP5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileService {

	public static void copyFile(File fileIn, File fileOut) throws IOException{
		try(InputStream is = new FileInputStream(fileIn);
				OutputStream os =new FileOutputStream(fileOut)){
			long totalBytes = is.transferTo(os);
			System.out.println(totalBytes + "Bite copy");
		}
	} 
	public static void copyFolder(File filderIn, File folderOut, String ext) throws IOException{
		File[] files = filderIn.listFiles();
		for (int i = 0; i < files.length; i++) {
			if(files[i].isFile() && (files[i].getName().endsWith(ext))) {
				File fileOut = new File(folderOut, files[i].getName());
				copyFile(files[i], fileOut);
			}
		}
	} 
}
