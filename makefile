MarkdownParse.class : MarkdownParse.java
	javac MarkdownParse.java

MarkdownParseTest.class : MarkdownParse.java MarkdownParseTest.java
	javac -cp .:lib/junit-4.10.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java

test : MarkdownParseTest.class MarkdownParse.class
	java -cp .:lib/junit-4.10.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
