package test.khalilhabbassi.Service;

import test.khalilhabbassi.entities.Medcin;

public interface IMedcinService {
    public Medcin addMedcinAndAssignToClinique(Medcin m ,long idClinique);
}
