package fh.campus02.hrhofer;

public class RecursionString {
    public static void main(String[] args) {
        System.out.println(searchRekursive("hallooooo", "hallo"));
    }
    public static boolean searchRekursive(String wort1, String wort2) {

        if (wort1.length() == wort2.length())
            return wort1.equals(wort2);
        String help = wort1.substring(0, wort2.length());
        if (help.equals(wort2))
            return true;
        return searchRekursive(wort1.substring(1), wort2);
    }
}
