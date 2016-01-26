Csc 435 (Compilers) Assignment 1 (University of Victoria).
Brett Binnersley
Sebastien Guillemot


The purpose of this assignment was to write a Lexer for the "Goo" language. (Goo is a subset of Google's goLang)
See here for the specification of all the tokens we were required to recognize.
https://golang.org/ref/spec

The project uses Antlr4 to generate .java files from the Goo.g4 file.


To use:
antlr4 Goo.g4
javac *.java -classpath antlr-4.5.1-complete.jar
grun Goo sourceFile -gui <MYFILE.GO>
