package Controller;




import Service.Mariage_mairieService;
import com.entity.Mariage_mairie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
public class Mariage_mairieController {

    @Autowired
    Mariage_mairieService mariage_mairieService;

    @GetMapping(value="/mariagemairie")
    public Collection<Mariage_mairie> getAll(){return mariage_mairieService.getAll();}

    @GetMapping(value="/mariagemairie/{id}")
    public Mariage_mairie getById(@PathVariable Long id){

        return mariage_mairieService.getById(id);
    }


    @PostMapping(value = "/mariagemairie/")
    public void save (@RequestBody Mariage_mairie mariage_mairie) { mariage_mairieService.save(mariage_mairie);}

    @PutMapping(value = "/mariagemairie")
    public void update(@RequestBody Mariage_mairie mariage_mairie){
        mariage_mairieService.update(mariage_mairie);}
    @DeleteMapping(value="/mariagemairie{id}")
    public void delete(@RequestBody Long id){mariage_mairieService.delete(id);}
}
