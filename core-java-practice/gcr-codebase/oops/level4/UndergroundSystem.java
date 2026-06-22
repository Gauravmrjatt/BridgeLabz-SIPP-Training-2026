import java.util.*;

public class UndergroundSystem {
    private HashMap<Integer, CheckInData> checkIns;
    private HashMap<String, TravelData> travelTimes;

    private class CheckInData {
        String stationName;
        int time;
        CheckInData(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }
    }

    private class TravelData {
        double totalTime;
        int count;
        TravelData(double totalTime, int count) {
            this.totalTime = totalTime;
            this.count = count;
        }
    }

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        travelTimes = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckInData(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckInData data = checkIns.remove(id);
        String route = data.stationName + "," + stationName;
        travelTimes.putIfAbsent(route, new TravelData(0, 0));
        TravelData td = travelTimes.get(route);
        td.totalTime += (t - data.time);
        td.count++;
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "," + endStation;
        TravelData td = travelTimes.get(route);
        return td.totalTime / td.count;
    }

    public static void main(String[] args) {
        UndergroundSystem us = new UndergroundSystem();
        us.checkIn(1, "A", 5);
        us.checkOut(1, "B", 15);
        System.out.println(us.getAverageTime("A", "B"));
        us.checkIn(2, "A", 10);
        us.checkIn(3, "A", 20);
        us.checkOut(2, "B", 25);
        us.checkOut(3, "B", 40);
        System.out.println(us.getAverageTime("A", "B"));
    }
}
