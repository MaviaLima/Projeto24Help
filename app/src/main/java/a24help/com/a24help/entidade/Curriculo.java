package a24help.com.a24help.entidade;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Curriculo {

    private String id;
    private String cpf;
    private String experiencia;
    private String categoria;
    private String servico;
    private String descricao;

    public Curriculo(){

    }

    public Curriculo(String id, String cpf, String experiencia, String categoria, String servico, String descricao) {
        this.id = id;
        this.cpf = cpf;
        this.experiencia = experiencia;
        this.categoria = categoria;
        this.servico = servico;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "Curriculo{" +
                "id='" + id + '\'' +
                ", cpf='" + cpf + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", categoria='" + categoria + '\'' +
                ", servico='" + servico + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
