package develhope.co.Exercise9;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestParam;

@Entity
@Table
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, name = "Cognome studente")
    private String lastName;
    @Column(nullable = false,unique = true, name = "Nome studente")
    private String firstName;
    @Column(nullable = false, name = "email studente")
    private String email;
}
