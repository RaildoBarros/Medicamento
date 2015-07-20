package telefone.bean;

import fornecedor.bean.FornecedorBean;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Raildo
 */
@Entity
@Table(name = "telefones")
public class TelefoneBean {
    
    @Id
    @Column(name = "codigo")
    @SequenceGenerator(name = "seq_telefones", sequenceName = "telefones_codigo_seq")
    @GeneratedValue(generator = "seq_telefones")
    private Integer codigo;
    @Column(name = "ddd")
    private String ddd;
    @Column(name = "numero")
    private String numero;
    @Column(name = "fornecedor")
    @OneToOne
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TelefoneBean other = (TelefoneBean) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    
    
}
