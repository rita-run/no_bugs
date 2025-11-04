package clean_code.practice.design_patterns.fabricmethod;

public class Main {
    public static void main(String[] args) {
        Logicstics logicstics;

        String transportType = "ship"; // Тип может быть основан на входных данных или конфигурации

        if ("truck".equals(transportType)) {
            logicstics = new LandLogictics();
        } else if ("ship".equals("transportType")) {
            logicstics = new SeaLogictics();
        } else {
            logicstics = new SkyLogistics();
        }

        logicstics.planDelivery();
    }
}