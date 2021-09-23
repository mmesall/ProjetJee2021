package Controller;



import Service.Quartier_mairieService;
import com.entity.Quartier_mairie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
public class Quartier_mairieController {

    @Autowired
    Quartier_mairieService quartier_mairieService;

    @GetMapping(value="/quartiermairie")
    public Collection<Quartier_mairie> getAll(){return quartier_mairieService.getAll();}

    @GetMapping(value="/quartiermairie/{id}")
    public Quartier_mairie getById(@PathVariable Long id){
        return quartier_mairieService.getById(id);
    }


    @PostMapping(value = "/quartiermairie/")
    public void save (@RequestBody Quartier_mairie quartier_mairie) {
        quartier_mairieService.save(quartier_mairie);
    }

    @PutMapping(value = "/quartiermairie")
    public void update(@RequestBody Quartier_mairie quartier_mairie){
        quartier_mairieService.update(quartier_mairie);
    }

    @DeleteMapping(value="/quartiermairie{id}")
    public void delete(@RequestBody Long id){
        quartier_mairieService.delete(id);
    }

}
