package nl.hybris.acorelcx.core.model;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Main {

    private float temp;
    private float feels_like;
    private float temp_min;
    private float temp_max;
    private Long pressure;
    private Long humidity;


}
