package com.bacarat.livebacaratbackend.controller;

import com.bacarat.livebacaratbackend.dto.DataResponse;
import com.bacarat.livebacaratbackend.dto.Payload;
import com.bacarat.livebacaratbackend.service.UserService;
import com.bacarat.livebacaratbackend.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = Constant.URL_API)
@CrossOrigin
public class LoginController {

    private UserService userService;

    @ResponseBody
    @PostMapping(value = {Constant.URL_LOGIN})
    public DataResponse UserLogin(@RequestBody Payload payload) {
        DataResponse data = new DataResponse(Constant.STATUS_ERROR);
        try {
            if(userService.UserLogin(payload.getUsername(), payload.getPassword())) {
                data.setStatus(Constant.STATUS_OK);
            }
        } catch (Exception e) {
            data.setStatus(e.getMessage());
        }
        return data;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}