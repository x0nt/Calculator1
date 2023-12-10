public class Parser {
    public static String[] readString(String s) {
        return s.split(" ");
    }

    public static boolean isArabic(String s) {
        try {
            Integer.parseInt(s);
        } catch (Exception exception) {
            return false;
        }
        return true;
    }
}
