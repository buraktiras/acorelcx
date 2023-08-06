package nl.hybris.acorelcx.core.model;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Sys {

    private Long type;
    private Long id;
    private String country;
    private Long sunrise;
    private Long sunset;

}
