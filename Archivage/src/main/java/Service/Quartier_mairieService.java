package Service;



import com.entity.Quartier_mairie;

import java.util.Collection;

public interface Quartier_mairieService {
    Collection<Quartier_mairie>getAll();
    Quartier_mairie getById(long id);
    Quartier_mairie save(Quartier_mairie quartier_mairie);
    void update(Quartier_mairie quartier_mairie);
    void delete(long id);

}
