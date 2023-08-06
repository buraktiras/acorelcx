package nl.hybris.acorelcx.core.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ResultList {

    private String country;
    private String city;
    private float temp;
    private String description;
    private String main;
}
