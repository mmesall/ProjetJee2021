package Service;



import com.entity.Structure_Sanitaire;

import java.util.Collection;

public interface StructureSanitaire_mairieService {
    Collection<Structure_Sanitaire> getAll();
    Structure_Sanitaire getById(long id);
    Structure_Sanitaire save(Structure_Sanitaire structure_sanitaire);
    void update(Structure_Sanitaire structure_sanitaire);
    void delete(long id);

}
