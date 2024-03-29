package pwr.ite.bedrylo.client.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(value = {"commune"})
public class City {
    
    private Integer id;
    
    private String name;
    
}
