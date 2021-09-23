package Service;



import com.entity.Registre_mairie;

import java.util.Collection;

public interface Registre_mairieService {


    Collection<Registre_mairie> getAll();
    Registre_mairie getById(long id);
    Registre_mairie save(Registre_mairie registre_mairie);
    void update(Registre_mairie registre_mairie);
    void delete(long id);
}
