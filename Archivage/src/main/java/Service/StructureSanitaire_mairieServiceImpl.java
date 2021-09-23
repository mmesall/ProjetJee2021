package Service;


import com.entity.Structure_Sanitaire;
import com.repository.Structure_mairieDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class StructureSanitaire_mairieServiceImpl implements StructureSanitaire_mairieService {
    @Autowired
    Structure_mairieDao structure_mairieDao;
    @Override
    public Collection<Structure_Sanitaire> getAll() {
        return structure_mairieDao.findAll();
    }

    @Override
    public Structure_Sanitaire getById(long id) {
        return structure_mairieDao.findById(id)
                .get();
    }

    @Override
    public Structure_Sanitaire save(Structure_Sanitaire structure_sanitaire) {
        return structure_mairieDao.save(structure_sanitaire);
    }

    @Override
    public void update(Structure_Sanitaire structure_sanitaire) {
        structure_mairieDao.save(structure_sanitaire);

    }

    @Override
    public void delete(long id) {structure_mairieDao.deleteById(id);

    }
}
