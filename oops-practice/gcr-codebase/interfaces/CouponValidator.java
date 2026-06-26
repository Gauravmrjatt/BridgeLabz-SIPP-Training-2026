interface CouponValidator {
    boolean validateCoupon(String code);
    static boolean isLengthValid(String code) {
        return code != null && code.length() >= 6;
    }
}

class ShoppingCart implements CouponValidator {
    public boolean validateCoupon(String code) {
        if (!CouponValidator.isLengthValid(code)) {
            return false;
        }
        return code.matches("[A-Z0-9]{6,12}");
    }
}

class CouponValidatorDemo {
    public static void main(String[] args) {
        String[] coupons = {"SAVE50", "abc", "FLAT100", "xyz12", "WELCOME", "OFF20"};
        ShoppingCart cart = new ShoppingCart();
        for (String code : coupons) {
            boolean valid = cart.validateCoupon(code);
            System.out.println(code + " -> " + (valid ? "Valid" : "Invalid"));
        }
    }
}
