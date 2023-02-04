package meteo;

import java.time.LocalDateTime;

public class Adapter implements MeteoSensor{
    private SensorTemperature sensTemp;

    public Adapter(SensorTemperature sensTemp) {
        this.sensTemp = sensTemp;
    }

    @Override
    public int getId() {
        return sensTemp.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) sensTemp.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime res = LocalDateTime.of(sensTemp.year(),1,1,0,0);
        res = res.plusDays(sensTemp.day()-1);
        res = res.plusSeconds(sensTemp.second());

        return res;
    }


}
