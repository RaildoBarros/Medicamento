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
public class TesteSelecionar {
    public static void main(String[] args) {
        MedicamentoDao produtoDao = new MedicamentoDao();
        
        try {
            MedicamentoBean produto = (MedicamentoBean) produtoDao.selecionar(1);
            System.out.println(produto.getNome());
        } catch (DaoException ex) {
            Logger.getLogger(TesteSelecionar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
