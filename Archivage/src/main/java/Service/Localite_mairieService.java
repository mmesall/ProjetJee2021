package Service;



import com.entity.Localite_mairie;

import java.util.Collection;

public interface Localite_mairieService {

    Collection<Localite_mairie>getAll();
    Localite_mairie getById(long id);
    Localite_mairie save(Localite_mairie localite_mairie);
    void update(Localite_mairie localite_mairie);
    void delete(long id);



}
