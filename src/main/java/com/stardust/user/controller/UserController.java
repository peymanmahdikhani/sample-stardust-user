package com.stardust.user.controller;

import com.stardust.core.controller.StardustController;
import com.stardust.core.service.StardustService;
import com.stardust.user.repository.UserEntity;
import com.stardust.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Peyman Mahdikhani on 11/24/2020.
 */
@RestController
@RequiredArgsConstructor
public class UserController extends StardustController<UserListModel, UserDetailModel, UserEntity, Long> {
    private final UserService userService;

    @Override
    protected StardustService<UserListModel, UserDetailModel, UserEntity, Long> getService() {
        return userService;
    }
}
