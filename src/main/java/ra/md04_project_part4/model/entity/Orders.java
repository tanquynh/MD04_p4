package ra.md04_project_part4.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serialNumber;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    private double totalPrice;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String note;
    private String receiveName;
    private String receiveAddress;
    private String receivePhone;

    private Date createdAt;
    private Date receiveAt;
    @OneToMany(mappedBy = "orders",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<OrderDetail> orderDetail;

}
