package test.khalilhabbassi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.khalilhabbassi.entities.Medcin;
import test.khalilhabbassi.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
