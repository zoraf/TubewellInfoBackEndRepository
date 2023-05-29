package com.zoraf.Tubewell_Information.Controller;

import com.zoraf.Tubewell_Information.Model.UserModel;
import com.zoraf.Tubewell_Information.POJO.ApiResponse;
import com.zoraf.Tubewell_Information.POJO.UserInformation;
import com.zoraf.Tubewell_Information.Repository.UserRepository;
import com.zoraf.Tubewell_Information.Util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public ApiResponse registration(@RequestBody UserInformation userInformation) {

        UserModel userModel = userRepository.findAllByEmail(userInformation.getEmail());

        if (userModel == null) {
            userModel = new UserModel();
            userModel.setUserName(userInformation.getUserName());
            userModel.setOrganizationName(userInformation.getOrganizationName());
            userModel.setMobileNumber(userInformation.getMobileNumber());
            userModel.setEmail(userInformation.getEmail());
            userModel.setPassword(userInformation.getPassword());
            userRepository.save(userModel);
            ApiResponse apiResponse = new ApiResponse();
            apiResponse.setResponse(Constant.REGISTRATION_DONE_SUCCESSFULLY);
            apiResponse.setResponseCode(Constant.REQUEST_SUCCESSFUL);
            return apiResponse;
        }
        else  {

            ApiResponse apiResponse = new ApiResponse();
            apiResponse.setResponse(Constant.REGISTRATION_DONE_PREVIOUSLY);
            apiResponse.setResponseCode(Constant.REGISTRATION_DONE);
            return apiResponse;
        }
    }
}
