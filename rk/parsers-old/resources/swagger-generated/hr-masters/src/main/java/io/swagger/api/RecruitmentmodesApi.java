package io.swagger.api;

import io.swagger.model.RecruitmentModeReq;
import io.swagger.model.ErrorRes;
import io.swagger.model.RecruitmentModeRes;
import io.swagger.model.RequestInfo;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

@Api(value = "recruitmentmodes", description = "the recruitmentmodes API")
public interface RecruitmentmodesApi {

    @ApiOperation(value = "Create a new recruitment mode to the master list.", notes = "To create a new recruitment mode we can use POST and set all the required and non-mandatory parameters.", response = RecruitmentModeRes.class, tags={ "Recruitment Mode", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recruitment mode created sucessfully.", response = RecruitmentModeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = RecruitmentModeRes.class) })
    @RequestMapping(value = "/recruitmentmodes/_create",
        method = RequestMethod.POST)
    ResponseEntity<RecruitmentModeRes> recruitmentmodesCreatePost(

@ApiParam(value = "Details for the new recruitment mode ." ,required=true ) @RequestBody RecruitmentModeReq recruitmentModes

);


    @ApiOperation(value = "Get the list of recruitment modes defined in the system.", notes = "Get the recruitment mode data. To get a particular recruitment mode one can pass the recruitment mode name. ", response = RecruitmentModeRes.class, tags={ "Recruitment Mode", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response.", response = RecruitmentModeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = RecruitmentModeRes.class) })
    @RequestMapping(value = "/recruitmentmodes/_search",
        method = RequestMethod.POST)
    ResponseEntity<RecruitmentModeRes> recruitmentmodesSearchPost(

@ApiParam(value = "Commmon request info for getting recruitment mode." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Name of the recruitment mode.") @RequestParam(value = "name", required = false) String name



,@ApiParam(value = "List of Unique Id of recruitment mode") @RequestParam(value = "id", required = false) List<Integer> id



,@ApiParam(value = "Recruitment mode search results will be sorted by name ascending by default.") @RequestParam(value = "sort", required = false) List<String> sort



);

}
