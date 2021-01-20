package com.stardust.user.service;

import com.stardust.core.service.StardustService;
import com.stardust.user.controller.UserDetailModel;
import com.stardust.user.controller.UserListModel;
import com.stardust.user.repository.UserEntity;

/**
 * Developer peyman mahdikhani
 * Email: payman.mahdikhani@gmail.com
 * Url: https://www.linkedin.com/in/peyman-mahdikhani
 * <p>
 * user UserService - 11/20/2020
 */
public interface UserService extends StardustService<UserListModel, UserDetailModel, UserEntity> {
}
