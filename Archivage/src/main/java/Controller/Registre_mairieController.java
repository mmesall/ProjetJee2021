package Controller;



import Service.Registre_mairieService;
import com.entity.Registre_mairie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
public class Registre_mairieController {

    @Autowired
    Registre_mairieService registre_mairieService;

    @GetMapping(value="/registremairie")
    public Collection<Registre_mairie> getAll(){
        return registre_mairieService.getAll();}

    @GetMapping(value="/registremairie/{id}")
    public Registre_mairie getById(@PathVariable Long id){
        return registre_mairieService.getById(id);
    }


    @PostMapping(value = "/registremairie/")
    public void save (@RequestBody Registre_mairie registre_mairie) {
        registre_mairieService.save(registre_mairie);
    }

    @PutMapping(value = "/registremairie")
    public void update(@RequestBody Registre_mairie registre_mairie){
        registre_mairieService.update(registre_mairie);
    }

    @DeleteMapping(value="/registremairie{id}")
    public void delete(@RequestBody Long id){
        registre_mairieService.delete(id);
    }

}
