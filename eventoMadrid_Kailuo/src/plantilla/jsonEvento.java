package plantilla;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class jsonEvento {

    @JsonProperty("@context")
    private Context context;

    @JsonProperty("@graph")
    private List<Evento> eventos;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }


    
}
    