package plantilla;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Area {
    // "@id": "https://datos.madrid.es/egob/kos/Provincia/Madrid/Municipio/Madrid/Distrito/SanBlas-Canillejas/Barrio/Rejas",
    // "locality": "MADRID",
    // "postal-code": "28022",
    // "street-address": "CALLE FEBRERO 4"

    @JsonProperty("@id")
    private String id;
    @JsonProperty("postal-code")
    private int postal_code;
    @JsonProperty("street-address")
    private String street_address;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getPostal_code() {
        return postal_code;
    }
    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }
    public String getStreet_address() {
        return street_address;
    }
    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    
}
