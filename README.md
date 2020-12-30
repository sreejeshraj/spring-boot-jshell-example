Steps
-----

1. Clone the project
2. Go to root folder where pom.xml is present
3. Executethe command "mvn compile com.github.johnpoth:jshell-maven-plugin:1.3:run"
4. You will get a jshell prompt with all the classes im pom.xml in classpath
5. import the multiple packages. Use * to import all classes
6. Start the overloaded main class in jshell prompt - "var springContext = AutoShutdownCamelMainClass.main()"
7. Play with it since you have the reference to spring context object. Get all beans, check what is inside beans etc!

https://www.youtube.com/watch?v=lTrzahYq5ok

a. There is a bug which does not autocomplete package names like com.sreejesh etc - 
    go ahead and type and it will list the class names anyway.
b. The main class is modified slightly - another main method which returns the application context
c. You should be using JDK 9+
