package fornecedor.dao;

import fornecedor.bean.FornecedorBean;
import util.BaseDaoImpl;

/**
 *
 * @author Raildo
 */
public class FornecedorDaoImpl extends BaseDaoImpl<FornecedorBean> implements FornecedorDao {

    public FornecedorDaoImpl() {
        super(FornecedorBean.class);
    }
    
}
