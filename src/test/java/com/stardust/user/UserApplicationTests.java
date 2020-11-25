package com.stardust.user;

import com.stardust.core.StardustTester;
import com.stardust.core.exception.StardustException;
import com.stardust.core.repository.StardustRepository;
import com.stardust.user.controller.UserDetailModel;
import com.stardust.user.controller.UserListModel;
import com.stardust.user.repository.UserEntity;
import com.stardust.user.repository.UserRepository;
import com.stardust.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class UserApplicationTests extends StardustTester<UserListModel, UserDetailModel, UserEntity,Long> {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @Override
    protected StardustRepository<UserEntity, Long> getStardustRepository() {
        return userRepository;
    }

    @Override
    protected UserEntity getDustEntityInstance() {
        return UserEntity.builder().build();
    }

    @Override
    protected UserDetailModel getValidDustDetail() throws StardustException {
        UserDetailModel userDetailModel = UserDetailModel
                .builder()
                .username("peyman")
                .password("123456")
                .personId(1L)
                .build();
        Long stardustEntityId = userService.createStardustEntity(userDetailModel);
        return userService.getStardustEntity(stardustEntityId);
    }
}
