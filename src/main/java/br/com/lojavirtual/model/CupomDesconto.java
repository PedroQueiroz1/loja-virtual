package br.com.lojavirtual.model;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "cup_desc")
@SequenceGenerator(name = "seq_cup_desc", sequenceName = "seq_cup_desc", initialValue = 1, allocationSize = 1)
public class CupomDesconto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cup_desc")
    private Integer id;

    private String codigoDescricao;

    private BigDecimal valorRealDescricao;

    private BigDecimal valorPorcentDescricao;

    @Temporal(TemporalType.DATE)
    private Date dataValidadeCupom;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoDescricao() {
        return codigoDescricao;
    }

    public void setCodigoDescricao(String codigoDescricao) {
        this.codigoDescricao = codigoDescricao;
    }

    public BigDecimal getValorRealDescricao() {
        return valorRealDescricao;
    }

    public void setValorRealDescricao(BigDecimal valorRealDescricao) {
        this.valorRealDescricao = valorRealDescricao;
    }

    public BigDecimal getValorPorcentDescricao() {
        return valorPorcentDescricao;
    }

    public void setValorPorcentDescricao(BigDecimal valorPorcentDescricao) {
        this.valorPorcentDescricao = valorPorcentDescricao;
    }

    public Date getDataValidadeCupom() {
        return dataValidadeCupom;
    }

    public void setDataValidadeCupom(Date dataValidadeCupom) {
        this.dataValidadeCupom = dataValidadeCupom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CupomDesconto that = (CupomDesconto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
