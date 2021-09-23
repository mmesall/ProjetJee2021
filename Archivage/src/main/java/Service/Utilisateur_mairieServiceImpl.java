package Service;


import com.entity.Utilisateur_mairie;
import com.repository.Utilisateur_mairieDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class Utilisateur_mairieServiceImpl  implements Utilisateur_mairieService{
    @Autowired
    Utilisateur_mairieDao utilisateur_mairieDao;
    @Override
    public Collection<Utilisateur_mairie> getAll() {
        return utilisateur_mairieDao.findAll();
    }

    @Override
    public Utilisateur_mairie getById(long id) {
        return utilisateur_mairieDao.findById(id).get();
    }

    @Override
    public Utilisateur_mairie save(Utilisateur_mairie utilisateur_mairie) {
        return utilisateur_mairieDao.save(utilisateur_mairie);
    }

    @Override
    public void update(Utilisateur_mairie utilisateur_mairie) {
        utilisateur_mairieDao.save(utilisateur_mairie);
    }

    @Override
    public void delete(long id) { utilisateur_mairieDao.deleteById(id);

    }
}
