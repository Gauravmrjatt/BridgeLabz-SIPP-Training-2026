public class PolymorphismDemo {
    
    // Vehicle hierarchy for Transport Company
    static abstract class Vehicle {
        abstract double fuelCost(int km);
    }
    
    static class Car extends Vehicle {
        @Override
        double fuelCost(int km) {
            return km * 10.0;
        }
    }
    
    static class Bus extends Vehicle {
        @Override
        double fuelCost(int km) {
            return km * 15.0;
        }
    }
    
    static class Bike extends Vehicle {
        @Override
        double fuelCost(int km) {
            return km * 5.0;
        }
    }
    
    static class ElectricCar extends Vehicle {
        @Override
        double fuelCost(int km) {
            return km * 2.0;
        }
    }
    
    static class Truck extends Vehicle {
        @Override
        double fuelCost(int km) {
            return km * 20.0;
        }
    }
    
    // Notification hierarchy
    static abstract class Notification {
        String recipientName;
        String message;
        
        Notification(String recipientName, String message) {
            this.recipientName = recipientName;
            this.message = message;
        }
        
        abstract void sendNotification();
    }
    
    static class EmailNotification extends Notification {
        EmailNotification(String recipientName, String message) {
            super(recipientName, message);
        }
        
        @Override
        void sendNotification() {
            System.out.println("Email sent to " + recipientName + ": " + message);
        }
    }
    
    static class SMSNotification extends Notification {
        SMSNotification(String recipientName, String message) {
            super(recipientName, message);
        }
        
        @Override
        void sendNotification() {
            System.out.println("SMS sent to " + recipientName + ": " + message);
        }
    }
    
    static class PushNotification extends Notification {
        PushNotification(String recipientName, String message) {
            super(recipientName, message);
        }
        
        @Override
        void sendNotification() {
            System.out.println("Push notification to " + recipientName + ": " + message);
        }
    }
    
    // Game Character hierarchy
    static abstract class GameCharacter {
        String characterName;
        
        GameCharacter(String characterName) {
            this.characterName = characterName;
        }
        
        abstract void performAttack();
    }
    
    static class Warrior extends GameCharacter {
        Warrior(String characterName) {
            super(characterName);
        }
        
        @Override
        void performAttack() {
            System.out.println(characterName + " attacks with sword!");
        }
    }
    
    static class Mage extends GameCharacter {
        Mage(String characterName) {
            super(characterName);
        }
        
        @Override
        void performAttack() {
            System.out.println(characterName + " casts fireball!");
        }
    }
    
    static class Archer extends GameCharacter {
        Archer(String characterName) {
            super(characterName);
        }
        
        @Override
        void performAttack() {
            System.out.println(characterName + " shoots an arrow!");
        }
    }
    
    // Library Member hierarchy
    static abstract class LibraryMember {
        String memberName;
        String memberId;
        
        LibraryMember(String memberName, String memberId) {
            this.memberName = memberName;
            this.memberId = memberId;
        }
        
        abstract int calculateFine(int overdueDays);
        
        void printDetails() {
            System.out.println("Name: " + memberName + ", ID: " + memberId);
        }
    }
    
    static class StudentMember extends LibraryMember {
        StudentMember(String memberName, String memberId) {
            super(memberName, memberId);
        }
        
        @Override
        int calculateFine(int overdueDays) {
            return overdueDays * 2;
        }
    }
    
    static class FacultyMember extends LibraryMember {
        FacultyMember(String memberName, String memberId) {
            super(memberName, memberId);
        }
        
        @Override
        int calculateFine(int overdueDays) {
            return overdueDays * 5;
        }
    }
    
    static class GuestMember extends LibraryMember {
        GuestMember(String memberName, String memberId) {
            super(memberName, memberId);
        }
        
        @Override
        int calculateFine(int overdueDays) {
            return overdueDays * 10;
        }
    }
    
    // Utility methods for polymorphism demonstration
    static void processVehicles(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println("Fuel cost: " + v.fuelCost(100));
        }
    }
    
    static void processNotifications(Notification[] notifications) {
        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
    
    static void startBattle(GameCharacter[] characters) {
        for (GameCharacter c : characters) {
            c.performAttack();
        }
    }
    
    static void processLibraryMembers(LibraryMember[] members) {
        for (LibraryMember m : members) {
            m.printDetails();
            System.out.println("Fine: $" + m.calculateFine(5));
        }
    }
    
    // Streaming Platform Subscription System
    static abstract class Subscription {
        String subscriberName;
        String subscriptionId;
        
        Subscription(String subscriberName, String subscriptionId) {
            this.subscriberName = subscriberName;
            this.subscriptionId = subscriptionId;
        }
        
        abstract double calculateMonthlyCharge();
    }
    
    static class BasicPlan extends Subscription {
        BasicPlan(String subscriberName, String subscriptionId) {
            super(subscriberName, subscriptionId);
        }
        
        @Override
        double calculateMonthlyCharge() {
            return 9.99;
        }
    }
    
    static class PremiumPlan extends Subscription {
        PremiumPlan(String subscriberName, String subscriptionId) {
            super(subscriberName, subscriptionId);
        }
        
        @Override
        double calculateMonthlyCharge() {
            return 15.99;
        }
    }
    
    static class FamilyPlan extends Subscription {
        FamilyPlan(String subscriberName, String subscriptionId) {
            super(subscriberName, subscriptionId);
        }
        
        @Override
        double calculateMonthlyCharge() {
            return 22.99;
        }
    }
    
    static class SubscriptionAnalyzer {
        static double calculateTotalRevenue(Subscription[] subscriptions) {
            double total = 0;
            for (Subscription s : subscriptions) {
                total += s.calculateMonthlyCharge();
            }
            return total;
        }
        
        static Subscription findMostExpensiveSubscription(Subscription[] subscriptions) {
            if (subscriptions == null || subscriptions.length == 0) return null;
            Subscription max = subscriptions[0];
            for (Subscription s : subscriptions) {
                if (s.calculateMonthlyCharge() > max.calculateMonthlyCharge()) {
                    max = s;
                }
            }
            return max;
        }
        
        static void displaySubscribersStartingWith(Subscription[] subscriptions, char letter) {
            for (Subscription s : subscriptions) {
                if (s.subscriberName.startsWith(String.valueOf(letter))) {
                    System.out.println("  " + s.subscriberName + " (" + s.subscriptionId + ")");
                }
            }
        }
    }
    
    // Disaster Rescue Management System
    static abstract class RescueTeam {
        String teamId;
        String location;
        
        RescueTeam(String teamId, String location) {
            this.teamId = teamId;
            this.location = location;
        }
        
        abstract void performDuty();
    }
    
    static class MedicalTeam extends RescueTeam {
        MedicalTeam(String teamId, String location) {
            super(teamId, location);
        }
        
        @Override
        void performDuty() {
            System.out.println("Medical team " + teamId + " providing medical aid in " + location);
        }
    }
    
    static class FireRescueTeam extends RescueTeam {
        FireRescueTeam(String teamId, String location) {
            super(teamId, location);
        }
        
        @Override
        void performDuty() {
            System.out.println("Fire rescue team " + teamId + " fighting fires in " + location);
        }
    }
    
    static class FoodSupplyTeam extends RescueTeam {
        FoodSupplyTeam(String teamId, String location) {
            super(teamId, location);
        }
        
        @Override
        void performDuty() {
            System.out.println("Food supply team " + teamId + " distributing food in " + location);
        }
    }
    
    static class RescueManager {
        static void performAllDuties(RescueTeam[] teams) {
            for (RescueTeam t : teams) {
                t.performDuty();
            }
        }
        
        static RescueTeam[] findTeamByLocation(RescueTeam[] teams, String location) {
            int count = 0;
            for (RescueTeam t : teams) {
                if (t.location.equals(location)) count++;
            }
            RescueTeam[] result = new RescueTeam[count];
            int index = 0;
            for (RescueTeam t : teams) {
                if (t.location.equals(location)) {
                    result[index++] = t;
                }
            }
            return result;
        }
        
        static void displayTeamsByPrefix(RescueTeam[] teams, String prefix) {
            for (RescueTeam t : teams) {
                if (t.teamId.startsWith(prefix)) {
                    System.out.println("  Team " + t.teamId + " (" + t.getClass().getSimpleName() + ")");
                }
            }
        }
        
        static String countTeamsByCategory(RescueTeam[] teams) {
            int medical = 0, fire = 0, food = 0;
            for (RescueTeam t : teams) {
                if (t instanceof MedicalTeam) medical++;
                else if (t instanceof FireRescueTeam) fire++;
                else if (t instanceof FoodSupplyTeam) food++;
            }
            
            int max = Math.max(medical, Math.max(fire, food));
            if (max == medical) return "MedicalTeam (" + medical + ")";
            else if (max == fire) return "FireRescueTeam (" + fire + ")";
            else return "FoodSupplyTeam (" + food + ")";
        }
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Test transport company fleet
        Vehicle[] vehicles = {new Car(), new Bus(), new Bike(), new ElectricCar(), new Truck()};
        System.out.println("=== Transport Company Fleet ===");
        processVehicles(vehicles);
        
        // Test smart notification system
        Notification[] notifications = {
            new EmailNotification("Alice", "Your package has shipped"),
            new SMSNotification("Bob", "Meeting reminder tomorrow"),
            new PushNotification("Charlie", "New message arrived")
        };
        System.out.println("\n=== Smart Notification System ===");
        processNotifications(notifications);
        
        // Test adventure game character system
        GameCharacter[] characters = {
            new Warrior("Arthur"),
            new Mage("Merlin"),
            new Archer("Elena")
        };
        System.out.println("\n=== Adventure Game Battle ===");
        startBattle(characters);
        
        // Test library membership system
        LibraryMember[] members = {
            new StudentMember("Student John", "S123"),
            new FacultyMember("Professor Smith", "F456"),
            new GuestMember("Guest Alice", "G789")
        };
        System.out.println("\n=== Library Membership System ===");
        processLibraryMembers(members);
        System.out.println("Found member: " + findMemberById(members, "F456"));
        
        // Test toll management (additional requirement)
        System.out.println("\n=== Vehicle Toll Management ===");
        double totalRevenue = 0;
        double maxToll = 0;
        Vehicle highestTollVehicle = null;
        for (Vehicle v : vehicles) {
            double toll = v.fuelCost(100); // simplified
            totalRevenue += toll;
            if (toll > maxToll) {
                maxToll = toll;
                highestTollVehicle = v;
            }
        }
        System.out.println("Total revenue: $" + totalRevenue);
        System.out.println("Highest toll payer: found");
        
        // Test streaming platform subscription system
        System.out.println("\n=== Streaming Platform Subscription ===");
        Subscription[] subscriptions = {
            new BasicPlan("User1", "B001"),
            new PremiumPlan("User2", "P001"),
            new FamilyPlan("User3", "F001")
        };
        System.out.println("Monthly revenue: $" + SubscriptionAnalyzer.calculateTotalRevenue(subscriptions));
        Subscription expensive = SubscriptionAnalyzer.findMostExpensiveSubscription(subscriptions);
        System.out.println("Most expensive: " + (expensive != null ? expensive.subscriptionId : "None"));
        System.out.println("Subscriptions starting with 'U':");
        SubscriptionAnalyzer.displaySubscribersStartingWith(subscriptions, 'U');
        
        // Test disaster rescue management system
        System.out.println("\n=== Disaster Rescue Management ===");
        RescueTeam[] teams = {
            new MedicalTeam("M001", "Zone A"),
            new FireRescueTeam("F001", "Zone B"),
            new FoodSupplyTeam("F002", "Zone A"),
            new MedicalTeam("M002", "Zone C")
        };
        RescueManager.performAllDuties(teams);
        System.out.println("Teams in Zone A: " + RescueManager.findTeamByLocation(teams, "Zone A").length);
        RescueManager.displayTeamsByPrefix(teams, "M");
        System.out.println("Category with max deployments: " + RescueManager.countTeamsByCategory(teams));
    }
    
    // Find member by ID (original utility method)
    static String findMemberById(LibraryMember[] members, String targetId) {
        for (LibraryMember m : members) {
            if (m.memberId.equals(targetId)) {
                return m.memberName;
            }
        }
        return "Not found";
    }
}