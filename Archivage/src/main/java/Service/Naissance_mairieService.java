package Service;



import com.entity.Naissance_mairie;

import java.util.Collection;
import java.util.Date;

public interface Naissance_mairieService {
    Collection<Naissance_mairie> getAll();
    Naissance_mairie getById(long id);
    Naissance_mairie save(Naissance_mairie naissance_mairie);
    void update(Naissance_mairie naissance_mairie);
    Naissance_mairie getByAnneeNaissance(Date Annee_Naissance);
    Naissance_mairie getByNumeroNaissance(String Numero_Naissance);

    void delete(long id);

}