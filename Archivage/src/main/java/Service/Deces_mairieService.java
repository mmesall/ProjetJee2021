package Service;


import com.entity.Deces_mairie;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface Deces_mairieService {
	
     Collection<Deces_mairie> getAll();
     Deces_mairie getById(long id);
     Deces_mairie save(Deces_mairie deces_mairie);
     void update(Deces_mairie deces_mairie);
     void delete(long id);


}
