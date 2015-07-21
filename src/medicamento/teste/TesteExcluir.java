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
public class TesteExcluir {
    public static void main(String[] args) {
        MedicamentoBean medicamento = new MedicamentoBean();
        medicamento.setCodigo(1);
        MedicamentoDaoImpl pd = new MedicamentoDaoImpl();
        
        try {
            pd.excluir(medicamento);
        } catch (DaoException ex) {
            Logger.getLogger(TesteExcluir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
