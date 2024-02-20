package develhope.co.Exercise9;

import jakarta.persistence.*;

@Entity
@Table
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, name = "Titolo classe")
    private String title;
    @Column(nullable = false, name = "Descrizione classe")
    private String description;

}
