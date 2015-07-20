/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicamento.teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import medicamento.bean.MedicamentoBean;
import medicamento.dao.MedicamentoDao;
import util.DaoException;

/**
 *
 * @author pierre
 */
public class TesteExclusao {
    public static void main(String[] args) {
        MedicamentoDao pd = new MedicamentoDao();
        
        try {
            pd.excluir(1);
        } catch (DaoException ex) {
            Logger.getLogger(TesteExclusao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
