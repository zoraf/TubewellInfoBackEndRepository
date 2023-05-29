package com.zoraf.Tubewell_Information.Controller;

import com.zoraf.Tubewell_Information.Model.UserModel;
import com.zoraf.Tubewell_Information.POJO.ApiResponse;
import com.zoraf.Tubewell_Information.POJO.LoginInformation;
import com.zoraf.Tubewell_Information.Repository.UserRepository;
import com.zoraf.Tubewell_Information.Util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public ApiResponse login(@RequestBody LoginInformation loginInformation, HttpServletRequest request) {
        String email = loginInformation.getEmail();
        String password = loginInformation.getPassword();
        UserModel userModel = userRepository.findAllByEmail(email);
        System.out.println("email:: " + email + "password:: " + password);
        ApiResponse apiResponse = new ApiResponse();
        if (userModel == null) {
            apiResponse.setResponse(Constant.NO_USER_FOUND);
            apiResponse.setResponseCode(Constant.REQUEST_FAILURE);
        }
        else if (userModel.getIsActive() == Constant.USER_INACTIVE) {
            apiResponse.setResponse(Constant.NOT_ACTIVATED);
            apiResponse.setResponseCode(Constant.USER_INACTIVE);
        }
        else if (!userModel.getPassword().equals(password)) {
            apiResponse.setResponse(Constant.WRONG_PASSWORD);
            apiResponse.setResponseCode(Constant.REQUEST_FAILURE);
        }
        else {
            request.getSession().setAttribute("email", email);
            apiResponse.setResponse(Constant.LOGIN_SUCCESSFUL);
            apiResponse.setResponseCode(Constant.REQUEST_SUCCESSFUL);
        }
        return apiResponse;
    }
}
