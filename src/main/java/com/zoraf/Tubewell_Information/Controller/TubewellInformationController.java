package com.zoraf.Tubewell_Information.Controller;


import com.zoraf.Tubewell_Information.Model.PurposeOfUseModel;
import com.zoraf.Tubewell_Information.Model.TubewellInformationModel;
import com.zoraf.Tubewell_Information.POJO.ApiResponse;
import com.zoraf.Tubewell_Information.POJO.TubewellInformation;
import com.zoraf.Tubewell_Information.Repository.TubewellInformationRepository;
import com.zoraf.Tubewell_Information.Util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tubewell_information")
public class TubewellInformationController {

    @Autowired
    TubewellInformationRepository tubewellInformationRepository;

    @PostMapping
    public ApiResponse submitTubewellInformation(@RequestBody TubewellInformation tubewellInformation, HttpServletRequest request) {
        ApiResponse apiResponse = new ApiResponse();

        try {
            tubewellInformation.setOwnerName("পানি সম্পদ পরিকল্পনা সংস্থা");
            tubewellInformation.setOwnerType("সরকারী");
            tubewellInformation.setDateOfInstallation("22.10.2022");
            tubewellInformation.setIsApprovalTaken("না");
            tubewellInformation.setApprovalAuthority("");
            tubewellInformation.setLastApprovalDate("২০.১০.২০২২");
            tubewellInformation.setNoOfUser("১০");
            List<String> listOfUsage = new ArrayList<String>();
            listOfUsage.add("খাবার পানি");
            listOfUsage.add("সেচ কাজ");
            listOfUsage.add( "কল কারখানা");
            tubewellInformation.setPurposeOfUsage(listOfUsage);
            tubewellInformation.setAmountOfWaterUse("১০০০ লিটার");
            tubewellInformation.setTubewellType("হস্তচালিত");
            tubewellInformation.setModeOfAbstraction("ফোর্স মোড");
            tubewellInformation.setLengthOfPipeUsed("১২০ফিট");
            tubewellInformation.setLatitude("23.752327");
            tubewellInformation.setLongitude("90.389355");
            TubewellInformationModel tubewellInformationModel = new TubewellInformationModel();
            tubewellInformationModel.setOwnerName(tubewellInformation.getOwnerName());
            tubewellInformationModel.setOwnerType(tubewellInformation.getOwnerType());
            tubewellInformationModel.setDateOfInstallation(tubewellInformation.getDateOfInstallation());
            tubewellInformationModel.setIsApprovalTaken(tubewellInformation.getIsApprovalTaken());
            tubewellInformationModel.setApprovalAuthority(tubewellInformation.getApprovalAuthority());
            tubewellInformationModel.setLastApprovalDate(tubewellInformation.getLastApprovalDate());
            tubewellInformationModel.setNoOfUser(tubewellInformation.getNoOfUser());
            tubewellInformationModel.setAmountOfWaterUse(tubewellInformation.getAmountOfWaterUse());
            tubewellInformationModel.setTubewellType(tubewellInformation.getTubewellType());
            tubewellInformationModel.setModeOfAbstraction(tubewellInformation.getModeOfAbstraction());
            tubewellInformationModel.setLengthOfPipeUsed(tubewellInformation.getLengthOfPipeUsed());
            tubewellInformationModel.setLatitude(tubewellInformation.getLatitude());
            tubewellInformationModel.setLongitude(tubewellInformation.getLongitude());
            tubewellInformationModel.setUserEmail((String) request.getSession().getAttribute("email"));

            System.out.println(tubewellInformation.getOwnerName() + " " + tubewellInformation.getOwnerType() + " " + "list size:: " + tubewellInformation.getPurposeOfUsage().size());
            for (int i = 0; i < tubewellInformation.getPurposeOfUsage().size(); i++) {
                PurposeOfUseModel purposeOfUseModel = new PurposeOfUseModel();
                purposeOfUseModel.setPurposeOfUse(tubewellInformation.getPurposeOfUsage().get(i));
                purposeOfUseModel.setTubewellInformationModel(tubewellInformationModel);
                tubewellInformationModel.getPurposeOfUsage().add(purposeOfUseModel);
            }

            tubewellInformationRepository.save(tubewellInformationModel);
            apiResponse.setResponse(Constant.MSG_SUBMIT_TUBEWELL_INFORMATION_SUCCESSFUL);
            apiResponse.setResponseCode(Constant.SUBMIT_TUBEWELL_INFORMATION_SUCCESSFUL);

        } catch (Exception e) {
            e.printStackTrace();
            apiResponse.setResponse(Constant.MSG_SUBMIT_TUBEWELL_INFORMATION_FAILED);
            apiResponse.setResponseCode(Constant.SUBMIT_TUBEWELL_INFORMATION_FAILED);
        }
        return apiResponse;
    }

}
