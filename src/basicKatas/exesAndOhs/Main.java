package basicKatas.exesAndOhs;

public class Main {
    public static void main(String[] args) {
        System.out.println(getXOShortImpl("OzxXzodoX"));
    }

    public static boolean getXOShortImpl(String str) {
        return str.chars()
                .map(Character::toUpperCase)
                .filter(c -> c == 'O' || c == 'X')
                .map(c -> c == 'O' ? 1 : -1)
                .sum() == 0;
    }

    public static boolean getXO(String str) {
        String filtered = str.replaceAll("[^oOxX]", "");
        boolean isEqual;

        if (filtered.length() % 2 == 1) {
            isEqual = false;
        } else {
            filtered = filtered.toUpperCase();
            int counter = 0;

            for (int i = 0; i < filtered.length(); i++) {
                char c = filtered.charAt(i);
                if (c == 'O') {
                    counter++;
                } else if (c == 'X') {
                    counter--;
                }
            }

            isEqual = counter == 0;
        }

        return isEqual;
    }
}