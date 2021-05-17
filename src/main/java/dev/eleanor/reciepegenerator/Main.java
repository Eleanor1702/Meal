/**
 * Created by eleanor on 3/1/17.
 */
package dev.eleanor.reciepegenerator;

import java.io.IOException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            String filePath = args[0];
            ReadFile file = new ReadFile(filePath);
            String[] aryLines = file.openFile();

            int randElem = new Random().nextInt(file.readLines());
            String elem = aryLines[randElem];
            System.out.println(
                "-----------------------------------" +
                "\n" +
                elem +
                "\n" +
                "-----------------------------------");

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + 
            "\n" +
            "-----------------------------------" + 
            "\n" +
            "No Menu List was given!" +
            "\n" +
            "-----------------------------------");
        }
    }
}
