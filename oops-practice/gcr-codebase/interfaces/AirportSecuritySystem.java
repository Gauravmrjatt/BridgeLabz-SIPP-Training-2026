interface LuggageScanner {
    default void displaySecurityGuidelines() {
        System.out.println("Luggage Guidelines: No liquids over 100ml, no sharp objects, no explosives.");
    }
}

interface PassportVerifier {
    default void displaySecurityGuidelines() {
        System.out.println("Passport Guidelines: Valid passport with at least 6 months validity required.");
    }
    static boolean isPassportNumberValid(String passportNo) {
        return passportNo != null && passportNo.matches("[A-Z]{1}[0-9]{7}");
    }
}

class AirportSecuritySystem implements LuggageScanner, PassportVerifier {
    private String[] passengers = {"John Doe", "Jane Smith", "Alice Brown", "Bob White"};
    private String[] passports = {"A1234567", "B234567", "C12345678", "D7654321"};
    private boolean[] luggageClear = {true, false, true, true};

    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }

    public void checkPassengers() {
        for (int i = 0; i < passengers.length; i++) {
            System.out.print(passengers[i] + " | Passport: " + passports[i]);
            boolean passValid = PassportVerifier.isPassportNumberValid(passports[i]);
            if (!passValid) {
                System.out.println(" -> Cannot Board: Invalid passport number.");
            } else if (!luggageClear[i]) {
                System.out.println(" -> Cannot Board: Luggage flagged.");
            } else {
                System.out.println(" -> Can Board.");
            }
        }
    }
}

class AirportSecurityDemo {
    public static void main(String[] args) {
        AirportSecuritySystem airport = new AirportSecuritySystem();
        airport.displaySecurityGuidelines();
        System.out.println();
        airport.checkPassengers();
    }
}
