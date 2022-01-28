import static org.junit.Assert.*;

import java.nio.file.Path;
import java.util.List;

import java.util.ArrayList;

import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;

public class MarkdownParseTest {
    @Test
    public void addition(){
        assertEquals(2, 1+1);
    }
/* commands to use
javac -cp .:lib/junit-4.10.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
java -cp .:lib/junit-4.10.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
*/
    @Test
    public void getLinksTester() throws IOException{
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://something.com", "some-page.html"), links);
    }
    /*
    @Test
    public void getLinksTester2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://something.com", "some-page.html"), links);
    }
    @Test
    public void getLinksTester3() throws IOException{
        Path fileName = Path.of("labnew.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }
    @Test
    public void getLinksTester4() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }

    @Test
    public void getLinksTester5() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }

    @Test
    public void getLinksTester6() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }

    @Test
    public void getLinksTester7() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }
    */
}