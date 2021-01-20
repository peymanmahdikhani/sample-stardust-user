package com.stardust.user.feignclient;

import com.stardust.person.controller.PersonDetailModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

/**
 * Developer peyman mahdikhani
 * Email: payman.mahdikhani@gmail.com
 * Url: https://www.linkedin.com/in/peyman-mahdikhani
 * <p>
 * stardust PersonClientService - 1/19/2021
 */
@FeignClient("person")
public interface PersonFeignClientService {
    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public ResponseEntity<PersonDetailModel> getPerson(@PathVariable("id") UUID personId);
}
