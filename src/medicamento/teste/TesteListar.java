package medicamento.teste;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import medicamento.bean.MedicamentoBean;
import medicamento.dao.MedicamentoDaoImpl;
import util.DaoException;

/**
 *
 * @author Raildo
 */
public class TesteListar {
    public static void main(String[] args) {
        MedicamentoDaoImpl pd = new MedicamentoDaoImpl();
                
        try {
            ArrayList<MedicamentoBean> medicamentos = (ArrayList<MedicamentoBean>) pd.listar();
            for (MedicamentoBean medicamento : medicamentos) {
                System.out.println(medicamento.getCodigo());
                System.out.println(medicamento.getNome());
                System.out.println(medicamento.getFormaFarmaceutica());
                System.out.println(medicamento.getMarca());
                //System.out.println(produto.getDataValidade());
                System.out.println(medicamento.getTipoMedicamento());
                System.out.println(medicamento.getDescricao());
                System.out.println(medicamento.getPrecoVenda());
                System.out.println(medicamento.getPrecoCompra());
                System.out.println(medicamento.getQuantidadeEstoque());
                System.out.println("------------------");
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteListar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
