package springbootapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;


import java.util.UUID;

@AllArgsConstructor
public class Student {
    @Getter
    @JsonProperty("id")
    private final UUID id;
    @Getter
    @JsonProperty("studentName")
    private final String studentName;


}



