package com.carter.lec07;

import java.io.File;
import java.io.IOException;

public class Lec07Main {

  public static void main(String[] args) throws IOException {
    JavaFilePrinter printer = new JavaFilePrinter();
    printer.readFile(getFilePath("/a.txt"));
  }

  private static String getFilePath(String fileName) {
    File currentFile = new File(".");
    return String.format("%s/%s", currentFile.getAbsolutePath(), fileName);
  }
}
