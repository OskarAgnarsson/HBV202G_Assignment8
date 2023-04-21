# HBV202G Final Project

#### Óskar Agnarsson(osa16@hi.is)

#### Máni Freyr Helgason(mfh7@hi.is)

Maven:

- `mvn compile` compiles all implementation classes
- `mvn compile exec:java` compiles all implementation classes and runs main
- `mvn exec:java` runs main
- `mvn test` runs all test cases
- `mvn package` creates executable jar file
- `mvn site` creates site from files in /site folder

To run the executable jar file, simply run the runjar.cmd file.

Design Pattern:

We used the Composite pattern to create Lendables, allowing us to store different types of things in the library, e.g. Books and Book Collections.

[Class Diagram](/src/site/markdown/design.md)


[License file](/LICENSE)