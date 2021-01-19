package no.noroff.nicholas.scenario1;

public class Alarm {
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;

    Sensor sensor = new Sensor(); // NB: Tight coupling through dependency
    boolean alarmOn = false;

    public void check(){
        double psiPressureValue = sensor.popNextPressurePsiValue();

        if(psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue){
            alarmOn = true;
        }
    }

    public boolean isAlarmOn(){
        return alarmOn;
    }
}
