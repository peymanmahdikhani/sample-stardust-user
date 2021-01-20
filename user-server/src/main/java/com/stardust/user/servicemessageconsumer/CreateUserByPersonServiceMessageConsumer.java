package com.stardust.user.servicemessageconsumer;

import com.stardust.core.exception.StardustException;
import com.stardust.core.jms.StardustServiceMessage;
import com.stardust.core.jms.StardustServiceMessageConsumer;
import com.stardust.core.statemachine.core.state.StardustStateDraft;
import com.stardust.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Developer peyman mahdikhani
 * Email: payman.mahdikhani@gmail.com
 * Url: https://www.linkedin.com/in/peyman-mahdikhani
 * <p>
 * stardust CreateUserByPersonDustServiceMessageConsumer - 1/19/2021
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class CreateUserByPersonServiceMessageConsumer implements StardustServiceMessageConsumer {
    private final UserService userService;

    @Override
    public String sourceDustName() {
        return "person";
    }

    @Override
    public String targetState() {
        return StardustStateDraft.STATE_NAME;
    }

    @Override
    public String targetEvent() {
        return StardustStateDraft.EVENT_VERIFY;
    }

    @Override
    public void execute(StardustServiceMessage stardustServiceMessage) throws StardustException {
        log.debug("execute");
    }
}
