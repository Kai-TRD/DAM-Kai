package plantilla;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Organization {
    // "organization-name": "Centro Cultural José Luis López Vázquez (San Blas - Canillejas)",
    // "accesibility": "2"

    @JsonProperty("organization-name")
    private String organization_name;
    private String accesibility;
    public String getOrganization_name() {
        return organization_name;
    }
    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name;
    }
    public String getAccesibility() {
        return accesibility;
    }
    public void setAccesibility(String accesibility) {
        this.accesibility = accesibility;
    }

    

}
