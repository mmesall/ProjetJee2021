package Service;



import com.entity.Utilisateur_mairie;

import java.util.Collection;

public interface Utilisateur_mairieService {
    Collection <Utilisateur_mairie> getAll();
    Utilisateur_mairie getById(long id);
    Utilisateur_mairie save(Utilisateur_mairie utilisateur_mairie);
    void update(Utilisateur_mairie utilisateur_mairie);
    void delete(long id);



}
