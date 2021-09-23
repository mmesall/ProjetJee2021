package Service;


import com.entity.Mariage_mairie;
import com.repository.Mariage_mairie_Dao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class Mariage_mairieServiceImpl implements Mariage_mairieService {
    @Autowired
    Mariage_mairie_Dao mariage_mairie_dao;

    @Override
    public Collection<Mariage_mairie> getAll() {
        return mariage_mairie_dao.findAll();
    }

    @Override
    public Mariage_mairie getById(long id) {
        return mariage_mairie_dao.findById(id).get();
    }

    @Override
    public Mariage_mairie save(Mariage_mairie mariage_mairie) {
        return mariage_mairie_dao.save(mariage_mairie);
    }

    @Override
    public void update(Mariage_mairie mariage_mairie) {
        mariage_mairie_dao.save(mariage_mairie);

    }

    @Override
    public void delete(long id) {mariage_mairie_dao.deleteById(id);

    }
}
