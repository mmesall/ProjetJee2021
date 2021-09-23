package Controller;



import Service.Deces_mairieService;
import com.entity.Deces_mairie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
public class Deces_mairieControler {
    @Autowired
    Deces_mairieService deces_mairieService;

    @GetMapping(value="/decesmairie")
    public Collection<Deces_mairie> getAll(){return deces_mairieService.getAll();}

    @GetMapping(value="/decesmairie/{id}")
    public Deces_mairie getById(@PathVariable Long id){
        return deces_mairieService.getById(id);
    }


     @PostMapping(value = "/decesmairie/")
     public void save (@RequestBody Deces_mairie deces_mairie) {
    	 deces_mairieService.save(deces_mairie);
    	 }

    @PutMapping(value = "/decesmairie")
    public void update(@RequestBody Deces_mairie deces_mairie){
    	deces_mairieService.update(deces_mairie);
    	}
    
    @DeleteMapping(value="/deces_mairie{id}")
    public void delete(@RequestBody Long id){
    	deces_mairieService.delete(id);
    	}


    }





