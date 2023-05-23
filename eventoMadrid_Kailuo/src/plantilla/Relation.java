package plantilla;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Relation {
    @JsonProperty("@id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
}
