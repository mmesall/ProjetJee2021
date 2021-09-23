package Controller;


import Service.Naissance_mairieService;
import com.entity.Naissance_mairie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
public class Naissance_mairieController {
    @Autowired
    Naissance_mairieService naissance_mairieService;

    @GetMapping(value="/naissancemairie")
    public Collection<Naissance_mairie> getAll(){
        return naissance_mairieService.getAll();
    }

    @GetMapping(value="/naissancemairie/{id}")
    public Naissance_mairie getById(@PathVariable Long id){

        return naissance_mairieService.getById(id);
    }


    @PostMapping(value = "/naissancemairie/")
    public void save (@RequestBody Naissance_mairie naissance_mairie) {
        naissance_mairieService.save(naissance_mairie);}

    @PutMapping(value = "/naissancemairie")
    public void update(@RequestBody Naissance_mairie naissance_mairie){
        naissance_mairieService.update(naissance_mairie);
    }
    @DeleteMapping(value="/naissancemairie{id}")
    public void delete(@RequestBody Long id){naissance_mairieService.delete(id);}
}
