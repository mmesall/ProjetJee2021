package Service;


import com.entity.Registre_mairie;
import com.repository.Registre_mairieDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class Registre_mairieServiceImpl implements Registre_mairieService {

    @Autowired
    Registre_mairieDao registre_mairieDao;

    @Override
    public Collection<Registre_mairie> getAll() {
        return registre_mairieDao.findAll();
    }

    @Override
    public Registre_mairie getById(long id) {
        return registre_mairieDao.findById(id)
                .get();
    }

    @Override
    public Registre_mairie save(Registre_mairie registre_mairie) {
        return registre_mairieDao.save(registre_mairie);
    }

    @Override
    public void update(Registre_mairie registre_mairie) { registre_mairieDao.save(registre_mairie);

    }

    @Override
    public void delete(long id) { registre_mairieDao.deleteById(id);

    }
}
