package com.stardust.user.service;

import com.stardust.core.repository.StardustRepository;
import com.stardust.core.service.StardustMapper;
import com.stardust.core.service.StardustServiceImpl;
import com.stardust.user.controller.UserDetailModel;
import com.stardust.user.controller.UserListModel;
import com.stardust.user.repository.UserEntity;
import com.stardust.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by Peyman Mahdikhani on 11/24/2020.
 * email: peyman.mahdikhani@gmail.com
 * Url: www.linkedin.com/in/peyman-mahdikhani
 * stardust-workspace
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl extends StardustServiceImpl<UserListModel, UserDetailModel, UserEntity> implements UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Override
    public StardustMapper<UserListModel, UserDetailModel, UserEntity> getStardustObjectMapper() {
        return userMapper;
    }

    @Override
    public StardustRepository<UserEntity> getStardustRepository() {
        return userRepository;
    }
}
