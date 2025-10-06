import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medium {

    public static void main(String[] args) {
        List<String> lines = readLinesFromFile("input/medium.in");

        lines = flipList(lines);

        printListOnNewLines(lines);
    }

    public static List<String> readLinesFromFile(String fileName) {
        List<String> lines = new ArrayList<>();

        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

        return lines;
    }

    public static <T> List<T> flipList(List<T> list) {
        List<T> flippedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            flippedList.add(list.get(i));
        }

        return flippedList;
    }

    public static <T> void printListOnNewLines(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

}
