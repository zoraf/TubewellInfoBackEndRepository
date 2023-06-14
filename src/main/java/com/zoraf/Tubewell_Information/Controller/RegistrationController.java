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

        UserModel userModel = new UserModel();
        try {
            userModel = userRepository.findAllByEmail(userInformation.getEmail());
            ApiResponse apiResponse = new ApiResponse();
            if (userModel == null) {
                userModel = new UserModel();
                userModel.setUserName(userInformation.getUserName());
                userModel.setOrganizationName(userInformation.getOrganizationName());
                userModel.setMobileNumber(userInformation.getMobileNumber());
                userModel.setEmail(userInformation.getEmail());
                userModel.setPassword(userInformation.getPassword());
                userModel.setIsActive(new Integer(0));
                userRepository.save(userModel);
                apiResponse.setResponse(Constant.MSG_REGISTRATION_DONE_SUCCESSFULLY);
                apiResponse.setResponseCode(Constant.REGISTRATION_DONE_SUCCESSFULLY);
                return apiResponse;
            } else {
                apiResponse.setResponse(Constant.MSG_REGISTRATION_DONE_PREVIOUSLY);
                apiResponse.setResponseCode(Constant.REGISTRATION_DONE_PREVIOUSLY);
                return apiResponse;
            }
        } catch (Exception e) {
            e.printStackTrace();
            ApiResponse apiResponse = new ApiResponse();
            apiResponse.setResponseCode(Constant.REGISTRATION_FAILED);
            apiResponse.setResponse(Constant.MSG_REGISTRATION_FAILED);
            return apiResponse;
        }
    }

}
