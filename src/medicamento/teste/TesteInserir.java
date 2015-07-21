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
public class TesteInserir {
    public static void main(String[] args) {
        MedicamentoBean medicamento = new MedicamentoBean();
        
        medicamento.setNome("Remédio");
        medicamento.setFormaFarmaceutica("Comprimidos");
        medicamento.setMarca("Aventis");
        medicamento.setDataValidade(Calendar.getInstance());
        medicamento.setTipoMedicamento("Original");
        medicamento.setDescricao("Uso adulto e pediátrico");
        medicamento.setPrecoVenda(80f);
        medicamento.setPrecoCompra(80f);
        medicamento.setQuantidadeEstoque(20);
        
        MedicamentoDaoImpl md = new MedicamentoDaoImpl();
        
        try {
            md.inserir(medicamento);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
    }
}







