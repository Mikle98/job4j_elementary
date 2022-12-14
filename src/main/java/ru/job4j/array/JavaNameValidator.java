package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean valid = !name.isEmpty();
        boolean notAllNumber = false;
        if (valid) {
            char[] array = name.toCharArray();
            for (int i = 0; i < name.length(); i++) {
                valid = (isSpecialSymbol(name.codePointAt(i))
                        || (isUpperLatinLetter(name.codePointAt(i)) && !Character.isUpperCase(name.codePointAt(0)))
                        || isLowerLatinLetter(name.codePointAt(i))
                        || Character.isDigit(name.codePointAt(i)));
                if (!Character.isDigit(name.codePointAt(i))) {
                    notAllNumber = true;
                }
                if (!valid) {
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
