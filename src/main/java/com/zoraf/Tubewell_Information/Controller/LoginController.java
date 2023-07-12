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

        try {
            ApiResponse apiResponse = new ApiResponse();
            System.out.println("inside login controller 1");
            String email = loginInformation.getEmail();
            String password = loginInformation.getPassword();
            System.out.println("inside login controller 1" + email+ " " + password);
            UserModel userModel = userRepository.findAllByEmail(email);
            if (userModel != null){
                System.out.println("user model is not null");
                System.out.println("email:: " + userModel.getEmail() + "password:: " + userModel.getIsActive());
                if (userModel.getIsActive().intValue() == Constant.USER_INACTIVE) {
                    apiResponse.setResponse(Constant.MSG_USER_INACTIVE);
                    apiResponse.setResponseCode(Constant.USER_INACTIVE);
                } else if (!userModel.getPassword().equals(password)) {
                    apiResponse.setResponse(Constant.MSG_WRONG_PASSWORD);
                    apiResponse.setResponseCode(Constant.WRONG_PASSWORD);
                } else {
                    request.getSession().setAttribute("email", email);
                    apiResponse.setResponse(Constant.MSG_LOGIN_SUCCESSFUL);
                    apiResponse.setResponseCode(Constant.LOGIN_SUCCESSFUL);
                }
            }
            else if (userModel == null) {
                System.out.println("user model is null");
                apiResponse.setResponse(Constant.MSG_NO_USER_FOUND);
                apiResponse.setResponseCode(Constant.USER_NOT_FOUND);
            }
            System.out.println("login controller:: " + apiResponse.getResponse());
            return apiResponse;
        } catch (Exception e) {
            System.out.println("inside login controller 2");
            e.printStackTrace();
            ApiResponse apiResponse = new ApiResponse();
            apiResponse.setResponseCode(Constant.LOGIN_FAILED);
            apiResponse.setResponse(Constant.MSG_LOGIN_FAILED);
            return apiResponse;
        }
    }
}
