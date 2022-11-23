package test.khalilhabbassi.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table( name = "Rendezvous")
public class Rendezvous  implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idRDV;
    private Date date;
    private String remarque;
    @ManyToOne(cascade = CascadeType.ALL)
    private Medcin medcin;
    @ManyToOne(cascade = CascadeType.ALL)
    private Patient patient;
}
