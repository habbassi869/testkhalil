package test.khalilhabbassi.Service;

import test.khalilhabbassi.entities.Clinique;
import test.khalilhabbassi.entities.Patient;
import test.khalilhabbassi.repository.PatientRepository;

public class PatientServiceImp implements IPatientService{
    PatientRepository patientRepository;
    @Override
    public Patient addPatient(Patient p) {
        return patientRepository.save(p);
    }
}
