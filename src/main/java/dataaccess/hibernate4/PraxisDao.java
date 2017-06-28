package dataaccess.hibernate4;

import entity.Praxis;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Lucas on 27/06/2017.
 */

@Repository
public class PraxisDao extends AbstractHibernateDao<Praxis> {

    public PraxisDao(){
        setClazz(Praxis.class);

    }
}
