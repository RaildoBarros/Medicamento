package medicamento.dao;

import medicamento.bean.MedicamentoBean;
import util.BaseDaoImpl;

/**
 *
 * @author Raildo
 */
public class MedicamentoDaoImpl extends BaseDaoImpl<MedicamentoBean> implements MedicamentoDao   {

    public MedicamentoDaoImpl() {
        super(MedicamentoBean.class);
    }
    
}
