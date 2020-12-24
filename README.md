Steps
-----

1. Clone the project
2. Go to root folder where pom.xml is present
3. To build - mvn clean install
4. Go to target folder, get the fat *.jar file that was built
5. Copy it to another directory and open a command prompt there
6. Extract the jar - jar xvf *.jar
7. SET CLASSPATH=BOOT-INF/lib/*;/BOOT-INF/classes
8. execute jshell command
9. import the multiple pckages. Use * to import all classes
10. var springContext = AutoShutdownCamelMainClass.main()
11. Play with it!

https://www.youtube.com/watch?v=lTrzahYq5ok

a. There is a bug which does not autocomplete package names like com.sreejesh etc - 
    go ahead and type and it will list the class names anyway.
b. The main class is modified slightly - another main method which returns the application context
