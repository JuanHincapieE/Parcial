package dominio;

public class TipoMaterial {
    public String pelicula;
    public String serie;
    public String documental;
    public String tutorial;
    public String videoMusical;

    public TipoMaterial(String pelicula, String serie, String documental, String tutorial, String videoMusical) {
        this.pelicula = "Pelicula";
        this.serie = "serie";
        this.documental = "documental";
        this.tutorial = "tutorial";
        this.videoMusical = "videoMusical";
    }
}
