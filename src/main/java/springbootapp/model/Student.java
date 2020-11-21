package springbootapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@AllArgsConstructor
public class Student {

    @Getter
    private final UUID id;
    /**
     * JsonProperty("id") - this one says that the given attribute in JSON will be named as Name
     *
     * @Notblack - put it so that there are no empty and null values and just spaces
     */
    @Getter
    @JsonProperty("Name")
    @NotBlank
    private final String studentName;


}



