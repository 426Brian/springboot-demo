package com.brian.sprbootdemo.controller;

import com.brian.sprbootdemo.domain.User;
import com.brian.sprbootdemo.service.AjaxResponseBody;
import com.brian.sprbootdemo.service.SearchCriteria;
import com.brian.sprbootdemo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Brian in 21:08 2018/4/11
 */
@RestController
public class SearchController {
    private static final Logger log = Logger.getLogger(SearchController.class);
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/search")
    public ResponseEntity<?> getSearchResultViaAjax(@Valid @RequestBody SearchCriteria search) {
        log.info(search.toString());

        AjaxResponseBody result = new AjaxResponseBody();
        List<User> users = userService.findByUserNameOrEmail(search.getUserName());

        if (users.isEmpty()) {
            result.setMsg("no user found");
        } else {
            result.setMsg("success");
        }

        result.setUsers(users);

        return ResponseEntity.ok(result);
    }

}
