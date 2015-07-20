package fornecedor.bean;

import medicamento.bean.MedicamentoBean;
import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Raildo
 */
public class FornecedorBean {
    
    @Id
    @Column(name = "codigo")
    @SequenceGenerator(name = "seq_fornecedores", sequenceName = "fornecedores_codigo_seq")
    @GeneratedValue(generator = "seq_fornecedores")
    private Integer codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cnpj")
    private String cnpj;
    @ManyToMany
    private ArrayList<MedicamentoBean> medicamentos;

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

    public ArrayList<MedicamentoBean> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<MedicamentoBean> medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.codigo);
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
        final FornecedorBean other = (FornecedorBean) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    
}
