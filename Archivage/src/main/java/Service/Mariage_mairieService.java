package Service;



import com.entity.Mariage_mairie;

import java.util.Collection;

public interface Mariage_mairieService {

    Collection <Mariage_mairie> getAll();
    Mariage_mairie getById(long id);
    Mariage_mairie save(Mariage_mairie mariage_mairie);
    void update(Mariage_mairie mariage_mairie);
    void delete(long id);

}
