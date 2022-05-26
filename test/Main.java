package test;

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
      Console.println("Create successfully");
    } else Console.println("Already exists");
    
    Console.pause();
    Console.exit();
    
  }
}
