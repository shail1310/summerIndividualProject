    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author Shail
 */
public class VitalSign {

    private int respRate;
    private int heartRate;
    private int bloodPressure;
    private int weight;
    private String timestamp;
    private String vitalSignStatus;

    public int getRespRate() {
        return respRate;
    }

    public void setRespRate(int respRate) {
        this.respRate = respRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getWieghtInPounds() {
        return weight;
    }

    public void setWieghtInPounds(int wieghtInPounds) {
        this.weight = wieghtInPounds;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getVitalSignStatus() {
        return vitalSignStatus;
    }

    public void setVitalSignStatus(String vitalSignStatus) {
        this.vitalSignStatus = vitalSignStatus;
    }

    /**
     * This method returns the status of the patient as "Normal" or "AbNormal"
     * comparing patient's vital sign values to normal range.
     *
     * @param patientAge
     * @return
     */
    public String evaluateVitalSignStatus(int patientAge) {

        // If patient age is between 1 to 3
        if (patientAge >= 1 && patientAge <= 3) {
            if (isRespRateAbNormal(respRateNormRangeLow_1to3,
                    respRateNormRangeHigh_1to3, respRate)
                    || isHeartRateAbNormal(heartRateNormRangeLow_1to3,
                            heartRateNormRangeHigh_1to3, heartRate)
                    || isSystBlPressureAbNormal(systBlPreNormRangeLow_1to3,
                            systBlPreNormRangeHigh_1to3, bloodPressure)
                    || isWeightAbNormal(weightNormRangeLow_1to3,
                            weightNormRangeHigh_1to3, weight)) {
                return "AbNormal";
            }
        }

        // If patient age is between 4 to 5
        if (patientAge >= 4 && patientAge <= 5) {
            if (isRespRateAbNormal(respRateNormRangeLow_4to5,
                    respRateNormRangeHigh_4to5, respRate)
                    || isHeartRateAbNormal(heartRateNormRangeLow_4to5,
                            heartRateNormRangeHigh_4to5, heartRate)
                    || isSystBlPressureAbNormal(systBlPreNormRangeLow_4to5,
                            systBlPreNormRangeHigh_4to5, bloodPressure)
                    || isWeightAbNormal(weightNormRangeLow_4to5,
                            weightNormRangeHigh_4to5, weight)) {
                return "AbNormal";
            }
        }

        // If patient age is between 6 to 12
        if (patientAge >= 6 && patientAge <= 12) {
            if (isRespRateAbNormal(respRateNormRangeLow_6to12,
                    respRateNormRangeHigh_6to12, respRate)
                    || isHeartRateAbNormal(heartRateNormRangeLow_6to12,
                            heartRateNormRangeHigh_6to12, heartRate)
                    || isSystBlPressureAbNormal(systBlPreNormRangeLow_6to12,
                            systBlPreNormRangeHigh_6to12, bloodPressure)
                    || isWeightAbNormal(weightNormRangeLow_6to12,
                            weightNormRangeHigh_6to12, weight)) {
                return "AbNormal";
            }
        }

        // If patient age is above 13
        if (patientAge >= 13) {
            if (isRespRateAbNormal(respRateNormRangeLow_13andAbove,
                    respRateNormRangeHigh_13andAbove, respRate)
                    || isHeartRateAbNormal(heartRateNormRangeLow_13andAbove,
                            heartRateNormRangeHigh_13andAbove, heartRate)
                    || isSystBlPressureAbNormal(systBlPreNormRangeLow_13andAbove,
                            systBlPreNormRangeHigh_13andAbove, bloodPressure)
                    || weight <= weightNormRangeLow_13andAbove) {
                return "AbNormal";
            }
        }
        return "Normal";
    }

    private boolean isRespRateAbNormal(int normalRangeLow, int normalRangeHigh,
            int respRate) {
        return respRate < normalRangeLow || respRate > normalRangeHigh;
    }

    private boolean isHeartRateAbNormal(int normalRangeLow, int normalRangeHigh,
            int heartRate) {
        return heartRate < normalRangeLow || heartRate > normalRangeHigh;
    }

    private boolean isSystBlPressureAbNormal(int normalRangeLow, int normalRangeHigh,
            int systBlPressure) {
        return systBlPressure < normalRangeLow || systBlPressure > normalRangeHigh;
    }

    private boolean isWeightAbNormal(int normalRangeLow, int normalRangeHigh,
            int weight) {
        return weight < normalRangeLow || weight > normalRangeHigh;
    }

    @Override
    public String toString() {
        return getTimestamp();
    }

    // Constants Respiratory Rate
    public static int respRateNormRangeLow_1to3 = 20;
    public static int respRateNormRangeHigh_1to3 = 30;
    public static int respRateNormRangeLow_4to5 = 20;
    public static int respRateNormRangeHigh_4to5 = 30;
    public static int respRateNormRangeLow_6to12 = 20;
    public static int respRateNormRangeHigh_6to12 = 30;
    public static int respRateNormRangeLow_13andAbove = 12;
    public static int respRateNormRangeHigh_13andAbove = 20;

    // Constants Heart Rate
    public static int heartRateNormRangeLow_1to3 = 80;
    public static int heartRateNormRangeHigh_1to3 = 130;
    public static int heartRateNormRangeLow_4to5 = 80;
    public static int heartRateNormRangeHigh_4to5 = 120;
    public static int heartRateNormRangeLow_6to12 = 70;
    public static int heartRateNormRangeHigh_6to12 = 110;
    public static int heartRateNormRangeLow_13andAbove = 55;
    public static int heartRateNormRangeHigh_13andAbove = 105;

    // Constants Systolic Blood Pressure
    public static int systBlPreNormRangeLow_1to3 = 80;
    public static int systBlPreNormRangeHigh_1to3 = 110;
    public static int systBlPreNormRangeLow_4to5 = 80;
    public static int systBlPreNormRangeHigh_4to5 = 110;
    public static int systBlPreNormRangeLow_6to12 = 80;
    public static int systBlPreNormRangeHigh_6to12 = 120;
    public static int systBlPreNormRangeLow_13andAbove = 110;
    public static int systBlPreNormRangeHigh_13andAbove = 120;

    // Constants Weight
    public static int weightNormRangeLow_1to3 = 22;
    public static int weightNormRangeHigh_1to3 = 31;
    public static int weightNormRangeLow_4to5 = 31;
    public static int weightNormRangeHigh_4to5 = 40;
    public static int weightNormRangeLow_6to12 = 41;
    public static int weightNormRangeHigh_6to12 = 92;
    public static int weightNormRangeLow_13andAbove = 110;
}
