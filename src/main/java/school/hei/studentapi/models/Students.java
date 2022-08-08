package school.hei.studentapi.models;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity

public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", length = 200)
    private String name;

    @ManyToOne
    private Groups groups;

    public Students(Groups group) {
        this.groups = group;
    }

    public Students(Long id, String name) {
        this.id= id;
        this.name= name;
    }
}
