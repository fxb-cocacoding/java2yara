# java2yara
A minimal library to generate YARA rules from JAVA

### How to use it:
You can easily integrate this repository into your codebase using maven:
```
git clone https://github.com/fxb-cocacoding/java2yara.git
cd java2yara
mvn package
mvn install:install-file -Dfile=target/java2yara-0.0.1-SNAPSHOT.jar -DpomFile=pom.xml
```
Then add the project to your maven repository (the <dependencies>-section of your pom.xml) using the following statement:
```
  <!-- java2yara -->
    <dependency>
      <groupId>com.cocacoding</groupId>
      <artifactId>java2yara</artifactId>
      <version>0.0.1-SNAPSHOT</version>
    </dependency>
```
