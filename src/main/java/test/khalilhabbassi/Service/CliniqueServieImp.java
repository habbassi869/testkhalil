package test.khalilhabbassi.Service;

import test.khalilhabbassi.entities.Clinique;
import test.khalilhabbassi.repository.CliniqueRepository;

public class CliniqueServieImp  implements ICliniqueService{
    CliniqueRepository cliniqueRepository;
    @Override
    public Clinique addClinique(Clinique c) {
        return cliniqueRepository.save(c);
    }

}
