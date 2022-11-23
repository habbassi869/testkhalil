package test.khalilhabbassi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.khalilhabbassi.entities.Clinique;
import test.khalilhabbassi.entities.Medcin;

public interface MedcinReository extends JpaRepository<Medcin,Long> {
}
