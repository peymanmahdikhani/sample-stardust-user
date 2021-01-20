package com.stardust.user.repository;

import com.stardust.core.repository.StardustEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

/**
 * Created by Peyman Mahdikhani on 11/24/2020.
 */
@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
public class UserEntity extends StardustEntity {
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(length = 36, columnDefinition = "varchar(36)", nullable = false, updatable = false)
    private UUID personId;
}
