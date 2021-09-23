package Service;


import com.entity.Localite_mairie;
import com.repository.Localite_mairieDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class Localite_mairieServiceImpl implements Localite_mairieService {
    @Autowired
    Localite_mairieDao localite_mairieDao;
    @Override
    public Collection<Localite_mairie> getAll() {
        return localite_mairieDao.findAll();
    }

    @Override
    public Localite_mairie getById(long id) {
        return localite_mairieDao.findById(id)
                .get();
    }


    @Override
    public Localite_mairie save(Localite_mairie localite_mairie) {
        return localite_mairieDao.save(localite_mairie);
    }

    @Override
    public void update(Localite_mairie localite_mairie) {
    localite_mairieDao.save(localite_mairie);

    }

    @Override
    public void delete(long id) {
    localite_mairieDao.deleteById(id);
    }
}
