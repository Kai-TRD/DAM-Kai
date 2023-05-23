package plantilla;

import com.fasterxml.jackson.annotation.JsonProperty;

public class jsonEvento {
    @JsonProperty("@graph")
    private Evento[] eventos;
}
    