import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Pacote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    private LocalDate dataPartida;
    private LocalDate dataChegada;

    private boolean nacional;

    private String estado;
    private String hospedagem;
    private String passeios;
    private String translado;
    private String cidades;

    private BigDecimal valor;

    public Pacote() {
    }

    public Pacote(Long id, String titulo, String descricao, LocalDate dataPartida, LocalDate dataChegada,
                  boolean nacional, String estado, String hospedagem, String passeios,
                  String translado, String cidades, BigDecimal valor) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.nacional = nacional;
        this.estado = estado;
        this.hospedagem = hospedagem;
        this.passeios = passeios;
        this.translado = translado;
        this.cidades = cidades;
        this.valor = valor;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public LocalDate getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(String hospedagem) {
        this.hospedagem = hospedagem;
    }

    public String getPasseios() {
        return passeios;
    }

    public void setPasseios(String passeios) {
        this.passeios = passeios;
    }

    public String getTranslado() {
        return translado;
    }

    public void setTranslado(String translado) {
        this.translado = translado;
    }

    public String getCidades() {
        return cidades;
    }

    public void setCidades(String cidades) {
        this.cidades = cidades;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    // Equals e HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pacote)) return false;
        Pacote pacote = (Pacote) o;
        return Objects.equals(id, pacote.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // ToString

    @Override
    public String toString() {
        return "Pacote{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataPartida=" + dataPartida +
                ", dataChegada=" + dataChegada +
                ", nacional=" + nacional +
                ", estado='" + estado + '\'' +
                ", hospedagem='" + hospedagem + '\'' +
                ", passeios='" + passeios + '\'' +
                ", translado='" + translado + '\'' +
                ", cidades='" + cidades + '\'' +
                ", valor=" + valor +
                '}';
    }
}
