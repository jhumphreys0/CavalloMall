package com.team6project.cavallo_mall.model;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/17 1:11
 */
@Data
public class UserLoginReqModel {

    @NotBlank(message = "username can not be empty")
    private String username;
    @NotBlank(message = "password can not be empty")
    private String password;

}
