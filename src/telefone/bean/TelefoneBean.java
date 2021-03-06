package telefone.bean;

import fornecedor.bean.FornecedorBean;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Raildo
 */
@Entity
@Table(name = "telefones")
public class TelefoneBean implements Serializable{
    
    @Id
    @Column(name = "codigo")
    @SequenceGenerator(name = "seq_telefones", sequenceName = "telefones_codigo_seq")
    @GeneratedValue(generator = "seq_telefones")
    private Integer codigo;
    @Column(name = "ddd")
    private String ddd;
    @Column(name = "numero")
    private String numero;
    @OneToOne
    @JoinColumn(name = "fornecedor_codigo")
    private FornecedorBean fornecedor;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public FornecedorBean getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorBean fornecedor) {
        this.fornecedor = fornecedor;
    }

}
