package com.stardust.user.controller;

import com.stardust.core.controller.StardustDetailModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

/**
 * Created by Peyman Mahdikhani on 11/24/2020.
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class UserDetailModel extends StardustDetailModel<Long> {
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private Long personId;
}
