package usuario.dao;

import usuario.bean.UsuarioBean;
import util.BaseDaoImpl;

/**
 *
 * @author Raildo
 */
public class UsuarioDaoImpl extends BaseDaoImpl<UsuarioBean> implements UsuarioDao {

    public UsuarioDaoImpl() {
        super(UsuarioBean.class);
    }
    
}
