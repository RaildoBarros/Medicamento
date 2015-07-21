package medicamento.teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import medicamento.bean.MedicamentoBean;
import medicamento.dao.MedicamentoDaoImpl;
import util.DaoException;

/**
 *
 * @author Raildo
 */
public class TesteSelecionar {
    public static void main(String[] args) {
        MedicamentoDaoImpl produtoDao = new MedicamentoDaoImpl();
        
        try {
            MedicamentoBean medicamento = (MedicamentoBean) produtoDao.selecionar(1);
            System.out.println(medicamento.getNome());
        } catch (DaoException ex) {
            Logger.getLogger(TesteSelecionar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
