package ra.md04_project_part4.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String username;
    private String fullName;
    private String email;
    private String password;

    @Pattern(regexp = "(0[3|5|7|8|9])+([0-9]{8})\\b", message = "Enter the Vietnamese phone")
    private String phone;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roleSet;
    private Date createdAt;
    private Date updatedAt;
    private boolean isDeleted;
    private String avatar;
    @Column(columnDefinition = "boolean default true")
    private boolean status = true;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<Address> address;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<Cart> carts;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<Wishlist> wishlists;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<Orders> order;
}
