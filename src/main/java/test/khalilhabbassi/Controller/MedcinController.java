package test.khalilhabbassi.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import test.khalilhabbassi.Service.IMedcinService;
import test.khalilhabbassi.entities.Medcin;

public class MedcinController {
IMedcinService iMedcinService;
    @PostMapping("/addMedcinAndAssignToClinique/{idClinique}")
    public Medcin addMedcinAndAssignToClinique(@RequestBody Medcin m,@PathVariable("idClinique")Long idClinique){
        return iMedcinService.addMedcinAndAssignToClinique(m ,idClinique);
    }
}
