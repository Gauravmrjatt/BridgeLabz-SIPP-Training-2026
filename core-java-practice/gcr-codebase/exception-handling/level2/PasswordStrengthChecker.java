class PasswordStrengthChecker {
    public void checkPassword(String password) {
        if (password == null) {
            System.out.println("Error: Password cannot be null");
            return;
        }
        if (password.isEmpty()) {
            System.out.println("Error: Password cannot be empty");
            return;
        }
        if (password.length() < 8) {
            System.out.println("Error: Password must be at least 8 characters long");
            return;
        }
        if (!Character.isUpperCase(password.charAt(0))) {
            System.out.println("Error: First character must be uppercase");
            return;
        }
        if (!Character.isDigit(password.charAt(password.length() - 1))) {
            System.out.println("Error: Last character must be a digit");
            return;
        }
        boolean hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if ("@#$%&* ".indexOf(c) >= 0) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            System.out.println("Error: Password must contain at least one special character (@, #, $, %, &, *)");
            return;
        }
        System.out.println("Password is strong and valid");
    }

    public static void main(String[] args) {
        PasswordStrengthChecker checker = new PasswordStrengthChecker();
        checker.checkPassword("");
        checker.checkPassword("short");
        checker.checkPassword("WeakPass");
        checker.checkPassword("GoodPass@");
        checker.checkPassword("GoodPass@7");
        checker.checkPassword("GoodPass@7");
        checker.checkPassword(null);
    }
}