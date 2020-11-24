package com.stardust.user.repository;

import com.stardust.core.repository.StardustEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Peyman Mahdikhani on 11/24/2020.
 */
@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
public class UserEntity extends StardustEntity<Long> {
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Long personId;
}
