package colori;

import java.awt.*;

public class TerminalColorizer {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BG_BLACK = "\u001B[40m";
    public static final String ANSI_BG_RED = "\u001B[41m";
    public static final String ANSI_BG_GREEN = "\u001B[42m";
    public static final String ANSI_BG_YELLOW = "\u001B[43m";
    public static final String ANSI_BG_BLUE = "\u001B[44m";
    public static final String ANSI_BG_PURPLE = "\u001B[45m";
    public static final String ANSI_BG_CYAN = "\u001B[46m";
    public static final String ANSI_BG_WHITE = "\u001B[47m";

    public static void main(String[] args) {
        System.out.println(colorizeText("Testo colorato", Color.RED, Color.YELLOW));
        System.out.println(colorizeBackground("Sfondo colorato", Color.GREEN, Color.BLUE));
    }

    public static String colorizeText(String text, Color textColor, Color bgColor) {
        String ansiTextColor = getAnsiColor(textColor);
        String ansiBgColor = getAnsiBackgroundColor(bgColor);
        return ansiTextColor + ansiBgColor + text + ANSI_RESET;
    }

    public static String colorizeBackground(String text, Color bgColor, Color textColor) {
        String ansiBgColor = getAnsiBackgroundColor(bgColor);
        String ansiTextColor = getAnsiColor(textColor);
        return ansiBgColor + ansiTextColor + text + ANSI_RESET;
    }

    private static String getAnsiColor(Color color) {
        if (color.equals(Color.BLACK)) {
            return ANSI_BLACK;
        } else if (color.equals(Color.RED)) {
            return ANSI_RED;
        } else if (color.equals(Color.GREEN)) {
            return ANSI_GREEN;
        } else if (color.equals(Color.YELLOW)) {
            return ANSI_YELLOW;
        } else if (color.equals(Color.BLUE)) {
            return ANSI_BLUE;
        } else if (color.equals(Color.MAGENTA)) {
            return ANSI_PURPLE;
        } else if (color.equals(Color.CYAN)) {
            return ANSI_CYAN;
        } else if (color.equals(Color.WHITE)) {
            return ANSI_WHITE;
        } else {
            return ANSI_RESET;
        }
    }

    private static String getAnsiBackgroundColor(Color color) {
        if (color.equals(Color.BLACK)) {
            return ANSI_BG_BLACK;
        } else if (color.equals(Color.RED)) {
            return ANSI_BG_RED;
        } else if (color.equals(Color.GREEN)) {
            return ANSI_BG_GREEN;
        } else if (color.equals(Color.YELLOW)) {
            return ANSI_BG_YELLOW;
        } else if (color.equals(Color.CYAN)){
            return  ANSI_BG_CYAN;
        } else return ANSI_BG_BLUE;
        }
}

