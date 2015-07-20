package telefone.dao;

import telefone.bean.TelefoneBean;
import util.BaseDaoImpl;

/**
 *
 * @author Raildo
 */
public class TelefoneDaoImpl extends BaseDaoImpl<TelefoneBean> implements TelefoneDao {

    public TelefoneDaoImpl() {
        super(TelefoneBean.class);
    }
    
}
