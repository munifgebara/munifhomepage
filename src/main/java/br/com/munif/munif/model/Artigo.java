package br.com.munif.munif.model;

import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 *
 * @author munif
 */
public class Artigo {

    @Id
    private String id;
    private String titulo;
    private String assunto;
    private Date quando;
    private String texto;

    public Artigo() {
        quando = new Date();
    }

    public Artigo(String titulo, String assunto, String texto) {
        quando = new Date();
        this.titulo = titulo;
        this.texto = texto;
        this.assunto = assunto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Date getQuando() {
        return quando;
    }

    public void setQuando(Date quando) {
        this.quando = quando;
    }

    @Override
    public String toString() {
        return String.format(
                "Artigo[id=%s, assunto='%s', titulo='%s']", id,assunto, titulo);
    }

}
