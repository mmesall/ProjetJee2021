package Service;



import com.entity.Roles_mairie;

import java.util.Collection;

public interface Roles_mairieService {
    Collection<Roles_mairie> getAll();
    Roles_mairie getById(long id);
    Roles_mairie save(Roles_mairie roles_mairie);
    void update(Roles_mairie roles_mairie);
    void delete(long id);

}
