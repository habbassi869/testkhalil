package test.khalilhabbassi.Service;

import test.khalilhabbassi.entities.Clinique;
import test.khalilhabbassi.entities.Medcin;
import test.khalilhabbassi.repository.CliniqueRepository;
import test.khalilhabbassi.repository.MedcinReository;

public class MedcinServiceImp implements IMedcinService{
    CliniqueRepository cliniqueRepository;
    MedcinReository medcinReository;
    @Override
    public Medcin addMedcinAndAssignToClinique(Medcin m, long idClinique) {
        Clinique c = cliniqueRepository.findById(idClinique).orElse(null);
        c.getMedcin().add(m);
        return medcinReository.save(m);    }
    }

