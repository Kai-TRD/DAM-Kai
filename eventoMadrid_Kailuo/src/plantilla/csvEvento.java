package plantilla;

public class csvEvento {
    
    private String idEvento;
    private String titulo;
    private String precio;
    private String gratuito;
    private String largaDuracion;
    private String diasSemana;
    private String diasExcluidos;
    private String fecha;
    private String fechaFin;
    private String hora;
    private String descripcion;
    private String contentUrl;
    private String tituloActividad;
    private String urlActividad;
    private String urlInstalacion;
    private String nombreInstalacion;
    private String accesibilidadInstalacion;
    private String claseVialInstalacion;
    private String nombreViaInstalacion;
    private String numInstalacion;
    private String distritoInstalacion;
    private String barrioInstalacion;
    private String codigoPostalInstalacion;
    private String coordenadaX;
    private String coordenadaY;
    private String latitud;
    private String longitud;
    private String tipo;
    private String audiencia;

    public csvEvento(String idEvento, String titulo, String precio, String gratuito, String largaDuracion,
            String diasSemana, String diasExcluidos, String fecha, String fechaFin, String hora, String descripcion,
            String contentUrl, String tituloActividad, String urlActividad, String urlInstalacion,
            String nombreInstalacion, String accesibilidadInstalacion, String claseVialInstalacion,
            String nombreViaInstalacion, String numInstalacion, String distritoInstalacion, String barrioInstalacion,
            String codigoPostalInstalacion, String coordenadaX, String coordenadaY, String latitud, String longitud,
            String tipo, String audiencia) {
        this.idEvento = idEvento;
        this.titulo = titulo;
        this.precio = precio;
        this.gratuito = gratuito;
        this.largaDuracion = largaDuracion;
        this.diasSemana = diasSemana;
        this.diasExcluidos = diasExcluidos;
        this.fecha = fecha;
        this.fechaFin = fechaFin;
        this.hora = hora;
        this.descripcion = descripcion;
        this.contentUrl = contentUrl;
        this.tituloActividad = tituloActividad;
        this.urlActividad = urlActividad;
        this.urlInstalacion = urlInstalacion;
        this.nombreInstalacion = nombreInstalacion;
        this.accesibilidadInstalacion = accesibilidadInstalacion;
        this.claseVialInstalacion = claseVialInstalacion;
        this.nombreViaInstalacion = nombreViaInstalacion;
        this.numInstalacion = numInstalacion;
        this.distritoInstalacion = distritoInstalacion;
        this.barrioInstalacion = barrioInstalacion;
        this.codigoPostalInstalacion = codigoPostalInstalacion;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.latitud = latitud;
        this.longitud = longitud;
        this.tipo = tipo;
        this.audiencia = audiencia;
    }

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getGratuito() {
        return gratuito;
    }

    public void setGratuito(String gratuito) {
        this.gratuito = gratuito;
    }

    public String getLargaDuracion() {
        return largaDuracion;
    }

    public void setLargaDuracion(String largaDuracion) {
        this.largaDuracion = largaDuracion;
    }

    public String getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(String diasSemana) {
        this.diasSemana = diasSemana;
    }

    public String getDiasExcluidos() {
        return diasExcluidos;
    }

    public void setDiasExcluidos(String diasExcluidos) {
        this.diasExcluidos = diasExcluidos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getTituloActividad() {
        return tituloActividad;
    }

    public void setTituloActividad(String tituloActividad) {
        this.tituloActividad = tituloActividad;
    }

    public String getUrlActividad() {
        return urlActividad;
    }

    public void setUrlActividad(String urlActividad) {
        this.urlActividad = urlActividad;
    }

    public String getUrlInstalacion() {
        return urlInstalacion;
    }

    public void setUrlInstalacion(String urlInstalacion) {
        this.urlInstalacion = urlInstalacion;
    }

    public String getNombreInstalacion() {
        return nombreInstalacion;
    }

    public void setNombreInstalacion(String nombreInstalacion) {
        this.nombreInstalacion = nombreInstalacion;
    }

    public String getAccesibilidadInstalacion() {
        return accesibilidadInstalacion;
    }

    public void setAccesibilidadInstalacion(String accesibilidadInstalacion) {
        this.accesibilidadInstalacion = accesibilidadInstalacion;
    }

    public String getClaseVialInstalacion() {
        return claseVialInstalacion;
    }

    public void setClaseVialInstalacion(String claseVialInstalacion) {
        this.claseVialInstalacion = claseVialInstalacion;
    }

    public String getNombreViaInstalacion() {
        return nombreViaInstalacion;
    }

    public void setNombreViaInstalacion(String nombreViaInstalacion) {
        this.nombreViaInstalacion = nombreViaInstalacion;
    }

    public String getNumInstalacion() {
        return numInstalacion;
    }

    public void setNumInstalacion(String numInstalacion) {
        this.numInstalacion = numInstalacion;
    }

    public String getDistritoInstalacion() {
        return distritoInstalacion;
    }

    public void setDistritoInstalacion(String distritoInstalacion) {
        this.distritoInstalacion = distritoInstalacion;
    }

    public String getBarrioInstalacion() {
        return barrioInstalacion;
    }

    public void setBarrioInstalacion(String barrioInstalacion) {
        this.barrioInstalacion = barrioInstalacion;
    }

    public String getCodigoPostalInstalacion() {
        return codigoPostalInstalacion;
    }

    public void setCodigoPostalInstalacion(String codigoPostalInstalacion) {
        this.codigoPostalInstalacion = codigoPostalInstalacion;
    }

    public String getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(String coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public String getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(String coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAudiencia() {
        return audiencia;
    }

    public void setAudiencia(String audiencia) {
        this.audiencia = audiencia;
    }



    


}
