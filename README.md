# XConsole-v2.0
This is an example of a console written in Java.
These are just test files and archive files for more information please message to clementmasiun@1998.gmail.com.

## Feature

### Version

* > __V2.0__

### Status
* > New update function

### Support

* > __Windows__ - _has been tested_
* > __Linux__ &emsp;&ensp; - not yet tested
* > __Mac__ &emsp;&emsp; - not yet tested

### Method

* #### Path method
```java
public static void setPath(String path)
public static String getPath()
public static boolean setDefaultPath()
```
* #### File method
```java
public static boolean createNewFile(String name)
public static boolean createNewFile(File file)
public static boolean makeDirectory(String name)
public static boolean makeDirectory(File file)
public static void delete(String name)
public static void delete(File file)
public static boolean exists(String name)
public static boolean exists(File file)
public static File[] listFiles(String name)
public static File[] listFiles(File file)
```
* #### Copy and Move method
```java
public static void copyTo(String source, String destination)
public static void copyTo(File source, File destination)
public static void moveTo(String source, String destination)
public static void moveTo(File source, File destination)
```
* #### Read and Write method
```java
public static String readFile(String file)
public static String readFile(File file)
public static void writeFile(String file, String text)
public static void writeFile(File file, String text)
```

## How to used

* #### Use on IntelliJ IDEA
Put the __Console.jar__ file on lib project.

Open Intellij IDE
>
> #### Open Project > File > Project Structure > Modules > Dependencies > Add > Select the Console.jar on lib > Click Ok


* #### Use with cmd
Create your project
>
> ###### Main.java
> xxDirectoryxx/xxProjectNamexx/test/Main.java<br>
> ###### Console.jar
> xxDirectoryxx/xxProjectNamexx/lib/Console.jar

Open command prompt and go to directory project
>
> #### > java -cp xxLibxx/Console.jar xxTestxx/Main.java
> or
> #### > java -classpath xxLibxx/Console.jar xxTestxx/Main.java

## Example

```java
package xconsole.test;

import xconsole.Console;

public class Main {
    public static void main(String[] args) {
	Console.clear();

        String path = "C:/xconsole_example/";
        String name = "File.txt";
        String filename = path + name;

       if (!Console.exists(path)) {
           Console.makeDirectory(path);
           Console.createNewFile(filename);
           Console.writeFile(filename, "Hello, world\nHai guys");
       } else Console.println("Already exists");

        Console.pause();
        Console.exit();
    }
}
```
