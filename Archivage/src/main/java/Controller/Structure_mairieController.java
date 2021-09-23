package Controller;


import Service.StructureSanitaire_mairieService;
import com.entity.Structure_Sanitaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
public class Structure_mairieController {

    @Autowired
    StructureSanitaire_mairieService structureSanitaire_mairieService;

    @GetMapping(value="/structureSanitaire")
    public Collection<Structure_Sanitaire> getAll(){
        return structureSanitaire_mairieService.getAll();}

    @GetMapping(value="/structureSanitaire/{id}")
    public Structure_Sanitaire getById(@PathVariable Long id){
        return structureSanitaire_mairieService.getById(id);
    }


    @PostMapping(value = "/structureSanitaire/")
    public void save (@RequestBody Structure_Sanitaire structure_Sanitaire) {
        structureSanitaire_mairieService.save(structure_Sanitaire);
    }

    @PutMapping(value = "/structureSanitaire")
    public void update(@RequestBody Structure_Sanitaire structure_Sanitaire){
        structureSanitaire_mairieService.update(structure_Sanitaire);
    }

    @DeleteMapping(value="/structureSanitaire{id}")
    public void delete(@RequestBody Long id){
        structureSanitaire_mairieService.delete(id);
    }

}
