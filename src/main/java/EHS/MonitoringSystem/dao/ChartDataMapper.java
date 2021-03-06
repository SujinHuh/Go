package EHS.MonitoringSystem.dao;

import EHS.MonitoringSystem.vo.ChartDataVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ChartDataMapper {

    //온도 차트데이터
    List<ChartDataVO> getAirTemperChartData(Map<String, Object> param) throws Exception;

    //풍속차트데이터
    List<ChartDataVO> getWindSpdChartData(Map<String, Object> param) throws Exception;

    //풍향차트데이터
    List<ChartDataVO> getWindDirChartData(Map<String, Object> param) throws Exception;

    //습도 차트데이터
    List<ChartDataVO> getRHumidityChartData(Map<String, Object> param) throws Exception;

    //조도 차트데이터
    List<ChartDataVO> getLuxChartData(Map<String, Object> param) throws Exception;

    //기압 차트데이터
    List<ChartDataVO> getAirPressureChartData(Map<String, Object> param) throws  Exception;

    //Vbat 차트데이터
    List<ChartDataVO> getVBatChartData(Map<String, Object> param) throws  Exception;
}
