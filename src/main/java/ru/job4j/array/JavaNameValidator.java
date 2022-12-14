package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isEmpty()) {
            char[] array = name.toCharArray();
            for (int i = 0; i < name.length(); i++) {
                valid = isSpecialSymbol(name.codePointAt(i))
                        || isUpperLatinLetter(name.codePointAt(i))
                        || isLowerLatinLetter(name.codePointAt(i))
                        || Character.isDigit(array[i])
                        || !Character.isUpperCase(name.codePointAt(i));
                if (!valid) {
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code == 36 || code == 95) {
            return true;
        }
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code >= 65 && code <= 90) {
            return true;
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code >= 97 && code <= 122) {
            return true;
        }
        return false;
    }
}
