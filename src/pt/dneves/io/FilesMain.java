package pt.dneves.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FilesMain {

	public static final Logger logger = Logger.getLogger(FilesMain.class.getName());
	
	public static void main(String[] args) {
	
		
		/*
		 * root (/, C:)
		 * 	users
		 * 		dneves
		 * 			docs
		 * 				some.txt
		 * 				other.txt
		 * 			pics
		 * 				pic.jpg
		 * 				shortcut.txt -> some.txt	
		 */
		
		
		// /users/dneves
		Path dnevesFolder = Path.of("/", "users", "dneves");
		
		
		// /users/dneves/docs/some.txt
		Path someFile = Path.of("/", "users", "dneves", "docs", "some.txt");

		
		for (int i = 0; i < someFile.getNameCount(); i++) {
			Path path = someFile.getName(i);
		}
		
		for (Path path : someFile) {
			
		}
		
		
		// shortcut.txt -> some.txt
		
		Path shortcutFile = Path.of("./pics/shortcut.txt");
		
		try {
			
			Files.createSymbolicLink(shortcutFile, someFile);
		
		} catch (IOException e) {
			logger.log(Level.SEVERE, "CABUM!!!", e);
		}
		
		
		
		try {
			
			Files.list(dnevesFolder).forEach(
					path -> System.out.println(path));
		
			// /users/dneves/docs
			// /users/dneves/pics
			
		} catch (IOException e) {
			logger.log(Level.SEVERE, "CABUM!!!", e);
		}
		
		
		try {
			
			Files.list(dnevesFolder)
				.map(path -> path.toString())
				.filter(string -> string.endsWith(".txt"))
				.forEach(string -> System.out.println(string));

			// /users/dneves/docs/some.txt
			// /users/dneves/docs/other.txt
			// /users/dneves/pics/shortcut.txt
			
		} catch (IOException e) {
			logger.log(Level.SEVERE, "CABUM!!!", e);
		}
		
		
		
		
		// outros métodos
		
		
		try {
		
			
			boolean isDirectory = Files.isDirectory(someFile);
			boolean isExecutable = Files.isExecutable(someFile);
			boolean isHidden = Files.isHidden(someFile);
			boolean isReadable = Files.isReadable(someFile);
			boolean isWritable = Files.isWritable(someFile);
			boolean isSymbolicLink = Files.isSymbolicLink(someFile);
			
			boolean isSameFile = Files.isSameFile(someFile, shortcutFile);
			
			
			PosixFileAttributes attibutes = Files.readAttributes(someFile, PosixFileAttributes.class);
			
			long size = attibutes.size();
			FileTime creationTime = attibutes.creationTime();
			FileTime lastModifiedTime = attibutes.lastModifiedTime();
			FileTime lastAccessTime = attibutes.lastAccessTime();
			
			UserPrincipal owner = attibutes.owner();
			GroupPrincipal group = attibutes.group();
			
			Set<PosixFilePermission> permissions = attibutes.permissions();
			
			String string = permissions.toString(); // rwxr-xr-x
			
		
		} catch (IOException e) {
			logger.log(Level.SEVERE, "CABUM!!!", e);
		}
		
		
	}
	
}
