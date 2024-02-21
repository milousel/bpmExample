package cz.claimcloud.user.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "claimcloud_payment")
public class ClaimCloudPayment {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "order_id", nullable = false)
    private int orderNumber;

    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;
}
