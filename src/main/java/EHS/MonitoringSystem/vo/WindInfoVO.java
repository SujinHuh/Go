package EHS.MonitoringSystem.vo;


import lombok.Data;

@Data
public class WindInfoVO {

    private String sensorId;
    private String windDir;
    private String windSpeed;
    private String airTemperature;
    private String lux;
    private String rHumidity;
    private String nowTime;

}
