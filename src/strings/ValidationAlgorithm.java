package strings;

public class ValidationAlgorithm {

    public static void main(String[] args) {
        String s1 = "RUSLAN";
        String s2 = "ruslan";
        String password1 = "P@$$w0rd";
        String password2 = "Password";

        System.out.println(isUppercase(s1));
        System.out.println(isLowerCase(s2));
        System.out.println(isPasswordComplex(password1));
        System.out.println(isPasswordComplex(password2));

    }

    public static boolean isUppercase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowerCase(String s) {
        return s.chars().allMatch(Character::isLowerCase);
    }

    /*
        Validate password complexity
     */
    public static boolean isPasswordComplex(String s) {
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit) &&
                s.chars().anyMatch(Character::isLetter);
    }

}
