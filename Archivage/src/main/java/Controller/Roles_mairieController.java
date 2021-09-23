package Controller;


import Service.Roles_mairieService;
import com.entity.Roles_mairie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
public class Roles_mairieController {

    @Autowired
    Roles_mairieService roles_mairieService;

    @GetMapping(value="/rolesmairie")
    public Collection<Roles_mairie> getAll(){
        return roles_mairieService.getAll();}

    @GetMapping(value="/rolesmairie/{id}")
    public Roles_mairie getById(@PathVariable Long id){
        return roles_mairieService.getById(id);
    }


    @PostMapping(value = "/rolesmairie/")
    public void save (@RequestBody Roles_mairie registre_mairie) {
        roles_mairieService.save(registre_mairie);
    }

    @PutMapping(value = "/rolesmairie")
    public void update(@RequestBody Roles_mairie registre_mairie){
        roles_mairieService.update(registre_mairie);
    }

    @DeleteMapping(value="/rolesmairie{id}")
    public void delete(@RequestBody Long id){
        roles_mairieService.delete(id);
    }

}
