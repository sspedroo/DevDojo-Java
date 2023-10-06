package org.pedro.classesUtilitarias.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\ESTUDOS\\JAVA\\DEV-DOJO\\DevDojo-Java\\file.txt");
        Path p2 = Paths.get("C:", "ESTUDOS", "JAVA", "DevDojo-Java", "file.txt");
        System.out.println(p1.getFileSystem());
        System.out.println(p2.getFileSystem());
    }
}
