import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hard {
    
    public static void main(String[] args) {
        List<String> lines = Medium.readLinesFromFile("input/hard.in");

        lines = Medium.flipList(lines);

        for (int i = 0; i < lines.size(); i++) {
            String flippedLine = flipString(lines.get(i));
            lines.set(i, flippedLine);
        }

        Medium.printListOnNewLines(lines);
    }

    private static String flipString(String str) {
        String flippedString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            flippedString += str.charAt(i);
        }

        return flippedString;
    }

}
