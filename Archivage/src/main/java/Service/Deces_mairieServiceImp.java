package Service;


import com.entity.Deces_mairie;
import com.repository.Deces_mairieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class Deces_mairieServiceImp implements Deces_mairieService {
	
	@Autowired
	private Deces_mairieDao deces_mairieDao;
	
	@Override
	public Collection<Deces_mairie> getAll(){

		return deces_mairieDao.findAll();
	}
	
	@Override
	public Deces_mairie getById(long id) {
		return deces_mairieDao.findById(id)
				.get();
	}
	
	@Override
	public Deces_mairie save(Deces_mairie deces_mairie) {

		return deces_mairieDao.save(deces_mairie);
	}

	@Override
	public void delete(long id) {

		deces_mairieDao.deleteById(id);
	}
	
	@Override
	public void update(Deces_mairie deces_mairie) {
		deces_mairieDao.save(deces_mairie);
	}
}
