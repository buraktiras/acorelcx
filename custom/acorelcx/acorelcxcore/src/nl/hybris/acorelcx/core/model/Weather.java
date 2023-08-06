package nl.hybris.acorelcx.core.model;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Weather {

    private Long id;
    private String main;
    private String description;
    private String icon;

}
