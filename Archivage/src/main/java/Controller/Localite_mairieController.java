package Controller;


import Service.Localite_mairieService;
import com.entity.Localite_mairie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

;

@RestController
@CrossOrigin(origins = "*")
public class Localite_mairieController {
    @Autowired
    Localite_mairieService localite_mairieService;

    @GetMapping(value="/localitemairie")
    public Collection<Localite_mairie> getAll(){return localite_mairieService.getAll();}

    @GetMapping(value="/localitesmairie/{id}")
    public Localite_mairie getById(@PathVariable Long id){

        return localite_mairieService.getById(id);
    }


    @PostMapping(value = "/decesmairie/")
    public void save (@RequestBody Localite_mairie localite_mairie) { localite_mairieService.save(localite_mairie);}

    @PutMapping(value = "/localitemairie")
    public void update(@RequestBody Localite_mairie localite_mairie){localite_mairieService.update(localite_mairie);}
    @DeleteMapping(value="/localitemairie{id}")
    public void delete(@RequestBody Long id){localite_mairieService.delete(id);}
}
