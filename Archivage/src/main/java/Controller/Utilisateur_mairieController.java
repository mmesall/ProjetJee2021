package Controller;



import Service.Utilisateur_mairieService;
import com.entity.Utilisateur_mairie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
public class Utilisateur_mairieController {

    @Autowired
    Utilisateur_mairieService utilisateur_mairieService;

    @GetMapping(value="/utilisateurmairie")
    public Collection<Utilisateur_mairie> getAll(){
        return utilisateur_mairieService.getAll();}

    @GetMapping(value="/utilisateurmairie/{id}")
    public Utilisateur_mairie getById(@PathVariable Long id){
        return utilisateur_mairieService.getById(id);
    }


    @PostMapping(value = "/utilisateurmairie/")
    public void save (@RequestBody Utilisateur_mairie utilisateur_mairie) {
        utilisateur_mairieService.save(utilisateur_mairie);
    }

    @PutMapping(value = "/utilisateurmairie")
    public void update(@RequestBody Utilisateur_mairie utilisateur_mairie){
        utilisateur_mairieService.update(utilisateur_mairie);
    }

    @DeleteMapping(value="/utilisateurmairie{id}")
    public void delete(@RequestBody Long id){
        utilisateur_mairieService.delete(id);
    }

}
