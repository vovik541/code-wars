package basicKatas.buildTower;

import java.util.Arrays;

import static java.util.stream.IntStream.range;

public class Main {
    public static void main(String[] args) {
        Arrays.asList(towerBuilderShortImpl(4)).forEach(System.out::println);
    }

    public static String[] towerBuilderShortImpl(int nFloors) {
        String[] tower = new String[nFloors];
        for (int i = 0; i < nFloors; i++)
            tower[i] = " ".repeat(nFloors - i - 1) + "*".repeat(2 * i + 1) + " ".repeat(nFloors - i - 1);
        return tower;
    }

    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];
        int width = 1 + (nFloors - 1) * 2;
        int middleIndex = width / 2;
        StringBuilder builder = new StringBuilder(" ".repeat(width));
        builder.setCharAt(middleIndex, '*');

        tower[0] = builder.toString();

        for (int i = 1; i < nFloors; i++) {
            builder.setCharAt(middleIndex - i, '*');
            builder.setCharAt(middleIndex + i, '*');
            tower[i] = builder.toString();
        }

        return tower;
    }

    //Also nice impl
    interface Kata {
        static String[] towerBuilder(int f) {
            return range(0, f).mapToObj(i -> String.format("%1$s%2$s%1$s", " ".repeat(f - i - 1), "*".repeat(2 * i + 1))).toArray(String[]::new);
        }
    }
}