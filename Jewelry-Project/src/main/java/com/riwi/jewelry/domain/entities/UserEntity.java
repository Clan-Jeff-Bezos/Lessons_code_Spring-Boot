package com.riwi.jewelry.domain.entities;

import com.riwi.jewelry.util.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 12)
    private String name;

    @Column(nullable = false, length = 15)
    private String email;

    @Column(nullable = false, length = 15)
    private String password;

    @Column(nullable = false)
    private Role role;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Review> reviews;
}
