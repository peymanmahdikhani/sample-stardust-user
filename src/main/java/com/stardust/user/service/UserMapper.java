package com.stardust.user.service;

import com.stardust.core.service.StardustMapper;
import com.stardust.core.service.StardustMapperConfig;
import com.stardust.user.controller.UserDetailModel;
import com.stardust.user.controller.UserListModel;
import com.stardust.user.repository.UserEntity;
import org.mapstruct.Mapper;

/**
 * Created by Peyman Mahdikhani on 11/24/2020.
 */
@Mapper(config = StardustMapperConfig.class)
public interface UserMapper extends StardustMapper<UserListModel, UserDetailModel, UserEntity> {
}
