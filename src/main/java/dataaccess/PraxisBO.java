package dataaccess;

import dataaccess.hibernate4.PraxisDao;
import entity.Praxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Lucas on 27/06/2017.
 */
@Service
public class PraxisBO {

    @Autowired
    PraxisDao praxisDao;


    @Transactional
    public void save(Praxis praxis){
        praxisDao.save(praxis);
    }
}
