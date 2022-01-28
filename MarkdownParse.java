// File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {
    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then take up to
        // the next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            //System.out.println(currentIndex);
            int nextOpenBracket = markdown.indexOf("[", currentIndex);
            int nextCloseBracket = markdown.indexOf("]", nextOpenBracket);
            if (nextOpenBracket == -1) break;
            String closeBracket = markdown.substring(nextCloseBracket+1, nextCloseBracket+2); 
            if (!closeBracket.equals("(")) break;
            int openParen = markdown.indexOf("(", nextCloseBracket);
            int closeParen = markdown.indexOf(")", openParen);
            //System.out.println("nextCloseB: " + nextCloseBracket + "; nextOpenB: "+ nextOpenBracket + "; currentIdx" + currentIndex +"\n");
            toReturn.add(markdown.substring(openParen + 1, closeParen));
            currentIndex = closeParen + 1;
<<<<<<< HEAD
            
            //System.out.println(currentIndex);
=======
            System.out.println(currentIndex);
>>>>>>> 9d95e7e5255294098d0389dc866e37f6c6993f25
        }
        return toReturn;
    }
    public static void main(String[] args) throws IOException {
		Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> links = getLinks(contents);
        System.out.println(links);
    }
}