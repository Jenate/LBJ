package assignment;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;



public class CopyFile {
//	private static CopyOption[] replace_existing;
//	static CopyOption[] ss = replace_existing ;
public static void main(String[] args) throws IOException {
	FileSystem fis =FileSystems.getDefault();
	Path srcPath = fis.getPath("D:/vsc.exe");
	Path destPath = fis.getPath("D:/vsc2.exe");
	
	
	try {
		long startTime = System.currentTimeMillis();
		Files.copy(srcPath, destPath);
		System.out.println("Time :" + (System.currentTimeMillis() - startTime));
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	
}
}
