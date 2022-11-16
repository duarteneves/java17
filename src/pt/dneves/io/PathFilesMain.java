package pt.dneves.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;

public class PathFilesMain {

	
	public static void createPaths() throws IOException {
		
		/*
		 * root (/, C:)
		 * 	users
		 * 		dneves
		 * 			docs
		 * 				some.txt
		 * 				other.txt
		 * 			backup
		 * 				docs
		 * 				readMe.txt
		 */
		
		
		Path source = Path.of("/users/dneves/docs");
		Path backup = Path.of("/users/dneves/back/docs");
		
		if(Files.notExists(backup)) {
			Files.createDirectories(backup); // chain of folders
		}
		
		
		Path readMe = backup.resolve("../readme.txt").normalize();
		Files.createFile(readMe);
		
		Files.writeString(readMe, "Backup time: " + Instant.now());
		
		Files.lines(readMe)
			.forEach(line -> System.out.print(line));
		
	}
	
	public static void createTemporaryFiles() throws IOException {
		
		Path tempFolder = Files.createTempDirectory("temp");
		Path tempFile = Files.createTempFile(tempFolder, "temp", ".tmp");
		
		Files.deleteIfExists(tempFile);
		Files.deleteIfExists(tempFolder);
		
	}
	
}
