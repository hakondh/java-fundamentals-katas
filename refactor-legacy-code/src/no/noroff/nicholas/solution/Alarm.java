package no.noroff.nicholas.solution;

public class Alarm {
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;

    Sensor sensor; // This is now any class that implements the Sensor interface
    boolean alarmOn = false;

    // Added a constructor
    public Alarm(Sensor sensor) { // It is possible to pass any sensor without changing this class
        this.sensor = sensor; // Dependency inversion
    }

    public void check(){
        double psiPressureValue = sensor.popNextPressurePsiValue(); // Method is still possible to call

        if(psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue){
            alarmOn = true;
        }
    }

    public boolean isAlarmOn(){
        return alarmOn;
    }
}
