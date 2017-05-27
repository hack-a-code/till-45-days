package io.swagger.api;

import io.swagger.model.RecruitmentTypeRes;
import io.swagger.model.RecruitmentTypeReq;
import io.swagger.model.ErrorRes;
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

@Api(value = "recruitmentType", description = "the recruitmentType API")
public interface RecruitmentTypeApi {

    @ApiOperation(value = "Create a new recruitment type to the master list.", notes = "To create a new recruitment type we can use POST and set all the required and non-mandatory parameters.", response = RecruitmentTypeRes.class, tags={ "Recruitment Type", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recruitment type created sucessfully.", response = RecruitmentTypeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = RecruitmentTypeRes.class) })
    @RequestMapping(value = "/recruitmentType/_create",
        method = RequestMethod.POST)
    ResponseEntity<RecruitmentTypeRes> recruitmentTypeCreatePost(

@ApiParam(value = "Details for the new recruitment type ." ,required=true ) @RequestBody RecruitmentTypeReq recruitmentType

);


    @ApiOperation(value = "Get the list of recruitment types defined in the system.", notes = "Get the recruitment type data. To get a particular receruitment type one can pass the recruitment type name. ", response = RecruitmentTypeRes.class, tags={ "Recruitment Type", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response.", response = RecruitmentTypeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = RecruitmentTypeRes.class) })
    @RequestMapping(value = "/recruitmentType/_search",
        method = RequestMethod.POST)
    ResponseEntity<RecruitmentTypeRes> recruitmentTypeSearchPost(

@ApiParam(value = "Commmon request info for getting recrutiment type." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Name of the recruitment type.") @RequestParam(value = "name", required = false) String name



,@ApiParam(value = "List of Unique Id of recruitment type") @RequestParam(value = "id", required = false) List<Integer> id



,@ApiParam(value = "Recruitment type search results will be sorted by name ascending by default.") @RequestParam(value = "sort", required = false) List<String> sort



);

}
