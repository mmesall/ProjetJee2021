package Service;


import com.entity.Roles_mairie;
import com.repository.Roles_mairieDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class Roles_mairieServiceImp implements Roles_mairieService {

    @Autowired
    private Roles_mairieDao roles_mairieDao;

    @Override
    public Collection<Roles_mairie> getAll() {

        return roles_mairieDao.findAll();
    }

    @Override
    public Roles_mairie getById(long id) {
        return roles_mairieDao.findById(id)
                .get();
    }

    @Override
    public Roles_mairie save(Roles_mairie roles_mairie) {
        return roles_mairieDao.save(roles_mairie);
    }

    @Override
    public void update(Roles_mairie roles_mairie) {
            roles_mairieDao.save(roles_mairie);
    }

    @Override
    public void delete(long id) {
            roles_mairieDao.deleteById(id);
    }
}
