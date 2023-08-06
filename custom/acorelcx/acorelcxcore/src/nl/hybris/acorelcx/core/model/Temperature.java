package nl.hybris.acorelcx.core.model;

import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@Getter
public class Temperature {

    private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    private String visibility;
    private Wind wind;
    private Clouds clouds;
    private Long dt;
    private Sys sys;
    private String timezone;
    private String id;
    private String name;
    private String code;

}
