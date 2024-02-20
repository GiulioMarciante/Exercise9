package develhope.co.Exercise9;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table

public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(nullable = false)
    private Students students;

    @ManyToMany
    private List<Classes> classes;
}
