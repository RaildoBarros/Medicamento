package fornecedor.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import medicamento.bean.MedicamentoBean;

/**
 *
 * @author Raildo
 */
@Entity
@Table(name = "fornecedores")
public class FornecedorBean implements Serializable{
    
    @Id
    @Column(name = "codigo")
    @SequenceGenerator(name = "seq_fornecedores", sequenceName = "fornecedores_codigo_seq")
    @GeneratedValue(generator = "seq_fornecedores")
    private Integer codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cnpj")
    private String cnpj;
    
    
//    private List<MedicamentoBean> medicamentos;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

//    public List<MedicamentoBean> getMedicamentos() {
//        return medicamentos;
//    }
//
//    public void setMedicamentos(List<MedicamentoBean> medicamentos) {
//        this.medicamentos = medicamentos;
//    }

}
