/**
 * Created by eleanor on 3/1/17.
 */
package org.eleanor;

import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = args[0];

        try {
            ReadFile file = new ReadFile(filePath);
            String[] aryLines = file.openFile();

            int randElem = new Random().nextInt(file.readLines());
            String elem = aryLines[randElem];
            System.out.println(elem);

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
