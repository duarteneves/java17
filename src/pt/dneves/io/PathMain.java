package pt.dneves.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PathMain {

	public static final Logger logger = Logger.getLogger(PathMain.class.getName());
	
	
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
		 */
		
		
		// /users/dneves/docs/some.txt
		Path someFile = Path.of("/", "users", "dneves", "docs", "some.txt");
		
		// some.txt
		Path someFileName = someFile.getFileName();
		
		// /users/dneves/docs
		Path docs = someFile.getParent();
		
		// assumindo que o programa corre sobre /users/dneves
		Path current = Path.of(".");
		
		// /users/dneves/docs/../pics/pic.jpg
		Path picFile = docs.resolve("../pics/pic.jpg");
		
		// /users/dneves/docs/other.txt
		Path otherFile = someFile.resolveSibling("other.txt");
		
		// /users/dneves/pics/pic.jpg
		Path normalisedPicFile = picFile.normalize();
		
		
		try {
			
			// /users/dneves/pics/pic.jpg
			Path verifiedPath = picFile.toRealPath();
		
		} catch (IOException e) {
			logger.log(Level.SEVERE, "CABUM!!!", e);
		}
		
	}
		
}
