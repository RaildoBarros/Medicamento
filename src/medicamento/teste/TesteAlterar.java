package medicamento.teste;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import medicamento.bean.MedicamentoBean;
import medicamento.dao.MedicamentoDaoImpl;
import util.DaoException;

/**
 *
 * @author Raildo
 */
public class TesteAlterar {
    public static void main(String[] args) {
        MedicamentoBean pd = new MedicamentoBean();
        
        pd.setCodigo(1);
        pd.setNome("Oximetolona");
        pd.setFormaFarmaceutica("Comprimidos");
        pd.setMarca("Aventis");
        pd.setDataValidade(Calendar.getInstance());
        pd.setTipoMedicamento("Original");
        pd.setDescricao("Uso adulto e pediátrico");
        pd.setPrecoVenda(80f);
        pd.setPrecoCompra(80f);
        pd.setQuantidadeEstoque(20);
        
        
        MedicamentoDaoImpl produtoDao = new MedicamentoDaoImpl();
       
        try {
            produtoDao.alterar(pd);
        } catch (DaoException ex) {
            Logger.getLogger(TesteAlterar.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
}
