package fornecedor.teste;

import fornecedor.bean.FornecedorBean;
import fornecedor.dao.FornecedorDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DaoException;

/**
 *
 * @author Raildo
 */
public class TesteInserir {
    public static void main(String[] args) {
        FornecedorBean fornecedor = new FornecedorBean();
        
        fornecedor.setNome("Cooperativa Medicamentos");
        
        FornecedorDaoImpl fd = new FornecedorDaoImpl();
        
        try {
            fd.inserir(fornecedor);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
