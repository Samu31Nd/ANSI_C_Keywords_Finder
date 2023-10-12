package org.example;

public class Main {
    public static void main(String[] args) {
        String directory = "./files";

        String file = FileManager.SearchFile(directory);
        String text = FileManager.readTextFromFile(file, directory);

        Function func = new Function();
        char []datatoChar = text.toCharArray();
        for (char c : datatoChar) {
            if(c== ' ') continue;
            func.recorrido(c);
        }
        func.fm.closeFiles();
    }
}