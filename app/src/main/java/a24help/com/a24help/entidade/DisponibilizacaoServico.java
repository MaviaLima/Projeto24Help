package a24help.com.a24help.entidade;

public class DisponibilizacaoServico {

    private String id;
    private String latitude;
    private String longitude;
    private String ativo;
    private String descricao;


    public DisponibilizacaoServico(String id, String latitude, String longitude, String ativo, String descricao) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.ativo = ativo;
        this.descricao = descricao;
    }

    public DisponibilizacaoServico() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "DisponibilizacaoServico{" +
                "id='" + id + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", ativo='" + ativo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
