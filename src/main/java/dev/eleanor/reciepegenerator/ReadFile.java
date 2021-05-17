package dev.eleanor.reciepegenerator;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
    private String path;

    // constructor..
    public ReadFile(String filePath) {
        path = filePath;
    }

    //method #1..
    public int readLines() throws IOException {
        FileReader fileToRead = new FileReader(path);
        BufferedReader bf = new BufferedReader(fileToRead);

        int numberOfLines = 0;

        while (bf.readLine() != null) {
            numberOfLines++;
        }
        bf.close();

        return numberOfLines;
    }

    public String[] openFile() throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];

        int i;
        for(i = 0; i < numberOfLines; i++) {
            textData[i] = textReader.readLine();
        }

        textReader.close();
        return textData;
    }
}
