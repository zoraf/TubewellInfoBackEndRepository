package com.zoraf.Tubewell_Information.Controller;

import com.zoraf.Tubewell_Information.POJO.ApiResponse;
import com.zoraf.Tubewell_Information.POJO.UserInformation;
import com.zoraf.Tubewell_Information.Util.Constant;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {

    @PostMapping
    public ApiResponse registration(@RequestBody UserInformation userInformation){

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setResponse("Registration is done");
        apiResponse.setResponseCode(Constant.REQUEST_SUCCESSFUL);
        return apiResponse;
    }
}
