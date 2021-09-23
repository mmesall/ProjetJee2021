package Service;



import com.entity.Quartier_mairie;
import com.repository.Quartier_mairieDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class Quartier_mairieServiceImpl implements Quartier_mairieService {
    @Autowired
    Quartier_mairieDao quartier_mairieDao;
    @Override
    public Collection<Quartier_mairie> getAll() {
        return quartier_mairieDao.findAll();
    }

    @Override
    public Quartier_mairie getById(long id) {
        return quartier_mairieDao.findById(id)
                .get();
    }

    @Override
    public Quartier_mairie save(Quartier_mairie quartier_mairie) {
        return quartier_mairieDao.save(quartier_mairie);
    }

    @Override
    public void update(Quartier_mairie quartier_mairie) {
        quartier_mairieDao.save(quartier_mairie);

    }

    @Override
    public void delete(long id) {quartier_mairieDao.deleteById(id);

    }
}
