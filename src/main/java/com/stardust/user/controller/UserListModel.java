package com.stardust.user.controller;

import com.stardust.core.controller.StardustListMode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * Created by Peyman Mahdikhani on 11/24/2020.
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class UserListModel extends StardustListMode<Long> {
    @NotNull
    private String username;
    @Null
    private String password;
    @NotNull
    private Long personId;
}
