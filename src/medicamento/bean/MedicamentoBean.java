package medicamento.bean;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Raildo
 */
@Entity
@Table(name = "medicamentos")
public class MedicamentoBean implements Serializable {
    
    @Id
    @Column(name = "codigo")
    @SequenceGenerator(name = "seq_medicamentos", sequenceName = "medicamentos_codigo_seq")
    @GeneratedValue(generator = "seq_medicamentos")
    private Integer codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "forma_farmaceutica")
    private String formaFarmaceutica;
    @Column(name = "marca")
    private String marca;
    @Column(name = "data_validade")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataValidade;
    @Column(name = "tipo_medicamento")
    private String tipoMedicamento;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "preco_venda")
    private Float precoVenda;
    @Column(name = "preco_compra")
    private Float precoCompra;
    @Column(name = "quantidade_em_estoque")
    private Integer quantidadeEstoque;

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the formaFarmaceutica
     */
    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    /**
     * @param formaFarmaceutica the formaFarmaceutica to set
     */
    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the dataValidade
     */
    public Calendar getDataValidade() {
        return dataValidade;
    }

    /**
     * @param dataValidade the dataValidade to set
     */
    public void setDataValidade(Calendar dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * @return the tipoMedicamento
     */
    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    /**
     * @param tipoMedicamento the tipoMedicamento to set
     */
    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the precoVenda
     */
    public Float getPrecoVenda() {
        return precoVenda;
    }

    /**
     * @param precoVenda the precoVenda to set
     */
    public void setPrecoVenda(Float precoVenda) {
        this.precoVenda = precoVenda;
    }

    /**
     * @return the quantidadeEstoque
     */
    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    /**
     * @param quantidadeEstoque the quantidadeEstoque to set
     */
    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    /**
     * @return the precoCompra
     */
    public Float getPrecoCompra() {
        return precoCompra;
    }

    /**
     * @param precoCompra the precoCompra to set
     */
    public void setPrecoCompra(Float precoCompra) {
        this.precoCompra = precoCompra;
    }

}
