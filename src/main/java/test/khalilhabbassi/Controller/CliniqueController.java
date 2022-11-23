package test.khalilhabbassi.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import test.khalilhabbassi.Service.ICliniqueService;
import test.khalilhabbassi.entities.Clinique;

public class CliniqueController {
    ICliniqueService  iCliniqueService;



    @PostMapping("/addClinique")
    @ResponseBody
    public Clinique addClinique(@RequestBody Clinique c){
        return iCliniqueService.addClinique(c);
    }
}
