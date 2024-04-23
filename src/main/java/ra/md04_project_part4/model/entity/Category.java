package ra.md04_project_part4.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String categoryName;
    private String description;
    private boolean status;
    @OneToMany(mappedBy = "category" ,fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Product> products;
}
