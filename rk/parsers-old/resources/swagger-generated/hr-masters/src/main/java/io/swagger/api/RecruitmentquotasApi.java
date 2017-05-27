package io.swagger.api;

import io.swagger.model.RecruitmentQuotaRes;
import io.swagger.model.RecruitmentQuotaReq;
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

@Api(value = "recruitmentquotas", description = "the recruitmentquotas API")
public interface RecruitmentquotasApi {

    @ApiOperation(value = "Create a new recruitment quota to the master list.", notes = "To create a new recruitment quota we can use POST and set all the required and non-mandatory parameters.", response = RecruitmentQuotaRes.class, tags={ "Recruitment Quota", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recruitment quota created sucessfully.", response = RecruitmentQuotaRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = RecruitmentQuotaRes.class) })
    @RequestMapping(value = "/recruitmentquotas/_create",
        method = RequestMethod.POST)
    ResponseEntity<RecruitmentQuotaRes> recruitmentquotasCreatePost(

@ApiParam(value = "Details for the new recruitment quota ." ,required=true ) @RequestBody RecruitmentQuotaReq recruitmentQuota

);


    @ApiOperation(value = "Get the list of recruitment quotas defined in the system.", notes = "Get the recruitment quota data. To get a particular recruitment quota one can pass the recruitment quota name. ", response = RecruitmentQuotaRes.class, tags={ "Recruitment Quota", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response.", response = RecruitmentQuotaRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = RecruitmentQuotaRes.class) })
    @RequestMapping(value = "/recruitmentquotas/_search",
        method = RequestMethod.POST)
    ResponseEntity<RecruitmentQuotaRes> recruitmentquotasSearchPost(

@ApiParam(value = "Commmon request info for getting recruitment quota." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Name of the recruitment quota.") @RequestParam(value = "name", required = false) String name



,@ApiParam(value = "List of Unique Id of recruitment quota") @RequestParam(value = "id", required = false) List<Integer> id



,@ApiParam(value = "Recruitment Quota search results will be sorted by name ascending by default.") @RequestParam(value = "sort", required = false) List<String> sort



);

}
