import java.time.Duration;
import java.time.Instant;

public class Text {

    private static final int MAX = 10000;

    
    public static void main(String[] args) {

    	instancia();

    	imutavel();
    	
    	
    	concatString();

        concatStringBuilder();
        
        

    }
    

    private static void concatString() {

        String string = "";

        Instant start = Instant.now();

        for (int i = 0; i < MAX; i++) {
            string += i;
        }

        Instant finish = Instant.now();
        long stringTimeElapsed = Duration.between(start, finish).toMillis();


        System.out.println(string);
        System.out.println(stringTimeElapsed);

    }


    private static void concatStringBuilder() {

        StringBuilder stringBuilder = new StringBuilder();

        Instant start = Instant.now();

        for (int i = 0; i < MAX; i++) {
            stringBuilder.append(i);
        }

        Instant finish = Instant.now();
        long stringBuilderTimeElapsed = Duration.between(start, finish).toMillis();


        System.out.println(stringBuilder);
        System.out.println(stringBuilderTimeElapsed);

    }
    
    private static void instancia() {
    	
    	String string1 = "Master";
    	
    	String string2 = "Master";
    	
    	
    	if(string1.equals(string2)) {
    		System.out.println("Equals (s1, s2): somos iguais.");
    	}
    	
    	
    	if(string1 == string2) {
    		System.out.println("== (s1, s2): somos iguais.");
    	}


    	
    	String string3 = new String("Master");
    	
    	if(string1.equals(string3)) {
    		System.out.println("Equals (s1, s3): somos iguais.");
    	}
    	
    	
    	if(string1 == string3) {
    		System.out.println("== (s1, s3): somos iguais.");
    	}
    	
    }
    
    private static void imutavel() {
    	
    	String string1 = "Master";
    	
    	String string2 = string1.toUpperCase();
    	
    	
    	System.out.println(string1 + " " + string2);

    	
    	string1 = "Master";

    	string1 = string2;

    	string1 = "Master Master";

    	string1 = string1.concat(" ").concat(string1);

    	
    	System.out.println(string1);
    
    }    
	
}
