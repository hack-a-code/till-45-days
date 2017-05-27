package io.swagger.api;

import io.swagger.model.RecruitmentModeReq;
import io.swagger.model.ErrorRes;
import io.swagger.model.RecruitmentModeRes;
import io.swagger.model.RequestInfo;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

@Controller
public class RecruitmentmodesApiController implements RecruitmentmodesApi {

    public ResponseEntity<RecruitmentModeRes> recruitmentmodesCreatePost(

@ApiParam(value = "Details for the new recruitment mode ." ,required=true ) @RequestBody RecruitmentModeReq recruitmentModes

) {
        // do some magic!
        return new ResponseEntity<RecruitmentModeRes>(HttpStatus.OK);
    }

    public ResponseEntity<RecruitmentModeRes> recruitmentmodesSearchPost(

@ApiParam(value = "Commmon request info for getting recruitment mode." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Name of the recruitment mode.") @RequestParam(value = "name", required = false) String name



,
        @ApiParam(value = "List of Unique Id of recruitment mode") @RequestParam(value = "id", required = false) List<Integer> id



,
        @ApiParam(value = "Recruitment mode search results will be sorted by name ascending by default.") @RequestParam(value = "sort", required = false) List<String> sort



) {
        // do some magic!
        return new ResponseEntity<RecruitmentModeRes>(HttpStatus.OK);
    }

}
