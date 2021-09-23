package Service;


import com.entity.Naissance_mairie;
import com.repository.Naissance_mairieDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Date;

public class Naissance_mairieServiceImpl implements Naissance_mairieService {
    @Autowired
    Naissance_mairieDao naissance_mairieDao;
    @Override
    public Collection<Naissance_mairie> getAll() {
        return naissance_mairieDao.findAll();
    }

    @Override
    public Naissance_mairie getById(long id) {
        return naissance_mairieDao.findById(id)
                .get();
    }

    @Override
    public Naissance_mairie save(Naissance_mairie naissance_mairie) {
        return naissance_mairieDao.save(naissance_mairie);
    }

    @Override
    public void update(Naissance_mairie naissance_mairie) {
    naissance_mairieDao.save(naissance_mairie);
    }

    @Override
    public Naissance_mairie getByAnneeNaissance(Date Annee_Naissance) {
        Long id =null;
        return naissance_mairieDao.findById(id).get();
    }

    @Override
    public Naissance_mairie getByNumeroNaissance(String Numero_Naissance) {
        return null;
    }

    @Override
    public void delete(long id) {
    	naissance_mairieDao.deleteById(id);

    }
}
