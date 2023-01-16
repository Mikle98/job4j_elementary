package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean valid = !name.isEmpty() && !Character.isUpperCase(name.codePointAt(0));
        boolean notAllNumber = false;
        if (valid) {
            char[] array = name.toCharArray();
            for (int i = 1; i < name.length(); i++) {
                if (!Character.isDigit(name.codePointAt(i)) && !notAllNumber) {
                    notAllNumber = true;
                }
                if (!(isSpecialSymbol(name.codePointAt(i))
                        || (isUpperLatinLetter(name.codePointAt(i)))
                        || isLowerLatinLetter(name.codePointAt(i))
                        || Character.isDigit(name.codePointAt(i)))) {
                    valid = false;
                    break;
                }
            }
        }
        return valid && notAllNumber;
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
