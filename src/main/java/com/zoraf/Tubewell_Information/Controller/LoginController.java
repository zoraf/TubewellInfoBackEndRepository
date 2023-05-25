package com.zoraf.Tubewell_Information.Controller;

import com.zoraf.Tubewell_Information.POJO.ApiResponse;
import com.zoraf.Tubewell_Information.POJO.LoginInformation;
import com.zoraf.Tubewell_Information.Util.Constant;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @PostMapping
    public ApiResponse login(@RequestBody LoginInformation loginInformation){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setResponse("Logins Successfully");
        apiResponse.setResponseCode(Constant.REQUEST_SUCCESSFUL);
        return apiResponse;
    }
}
