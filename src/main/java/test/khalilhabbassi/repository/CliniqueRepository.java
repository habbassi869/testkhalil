package test.khalilhabbassi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.khalilhabbassi.entities.Clinique;

public interface CliniqueRepository  extends JpaRepository<Clinique,Long> {
}
