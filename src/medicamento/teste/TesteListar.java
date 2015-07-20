/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicamento.teste;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import medicamento.bean.MedicamentoBean;
import medicamento.dao.MedicamentoDao;
import util.DaoException;

/**
 *
 * @author pierre
 */
public class TesteListar {
    public static void main(String[] args) {
        MedicamentoDao pd = new MedicamentoDao();
                
        try {
            ArrayList<MedicamentoBean> produtos = (ArrayList<MedicamentoBean>) pd.listar();
            for (MedicamentoBean produto : produtos) {
                System.out.println(produto.getCodigo());
                System.out.println(produto.getNome());
                System.out.println(produto.getFormaFarmaceutica());
                System.out.println(produto.getMarca());
                //System.out.println(produto.getDataValidade());
                System.out.println(produto.getTipoMedicamento());
                System.out.println(produto.getDescricao());
                System.out.println(produto.getPrecoVenda());
                System.out.println(produto.getPrecoCompra());
                System.out.println(produto.getQuantidadeEstoque());
                System.out.println("------------------");
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteListar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
