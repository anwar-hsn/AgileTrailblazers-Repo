# AgileTrailblazers-Repo
1. Set gekodriver path in the OpenBrowser.class located at src/main/java, utility package. After that update the maven project(Alt+F5). 
2. Use below dependecies: 

<dependencies>
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.6.0</version>
</dependency>

<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>6.11</version>
    <scope>test</scope>
</dependency>

  <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>2.1.0</version>
</dependency>

   <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>2.1.0</version>
    <scope>test</scope>
</dependency>
   
  <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-core -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-core</artifactId>
    <version>2.1.0</version>
</dependency>
  
<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-picocontainer</artifactId>
    <version>1.2.5</version>
</dependency>
   
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
    <version>2.10.0</version>
</dependency>

<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.10.0</version>
</dependency>

</dependencies>

3. Add below property in the project
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>

4. add below plugings 

<build>
    <pluginManagement>
      <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.20.1</version>
          <configuration>
          <suiteXmlFiles>
            <suiteXmlFile>testng.xml</suiteXmlFile>
          </suiteXmlFiles>
        </configuration>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>

5. To run from feature file please go Runner.class in the src/test/java and run using JUnit.
6. To run using TestNG, please got to SmokeTest.class in the src/test/java and run using TestNG.
7. To run using maven, please use testng.xml file. 
