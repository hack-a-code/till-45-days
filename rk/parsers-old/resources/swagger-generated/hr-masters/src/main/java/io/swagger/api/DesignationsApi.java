package io.swagger.api;

import io.swagger.model.DesignationRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.DesignationReq;
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

@Api(value = "designations", description = "the designations API")
public interface DesignationsApi {

    @ApiOperation(value = "Create a new Designation.", notes = "To create a new designation we need to call this API.", response = DesignationRes.class, tags={ "Designation", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Designation created sucessfully.", response = DesignationRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = DesignationRes.class) })
    @RequestMapping(value = "/designations/_create",
        method = RequestMethod.POST)
    ResponseEntity<DesignationRes> designationsCreatePost(

@ApiParam(value = "Details for the new designation ." ,required=true ) @RequestBody DesignationReq designation

);


    @ApiOperation(value = "Get the list of designations defined in the system or a particular designation.", notes = "Get the designation master data for the parameter values.", response = DesignationRes.class, tags={ "Designation", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = DesignationRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = DesignationRes.class) })
    @RequestMapping(value = "/designations/_search",
        method = RequestMethod.POST)
    ResponseEntity<DesignationRes> designationsSearchPost(

@ApiParam(value = "Commmon request info for getting designation." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Designation results will be sorted by name ascending by default if this parameter is not provided.", defaultValue = "[+name]") @RequestParam(value = "sort", required = false, defaultValue="[+name]") List<String> sort



,@ApiParam(value = "Name of the designation.") @RequestParam(value = "name", required = false) String name



,@ApiParam(value = "Unique code of the designation.") @RequestParam(value = "code", required = false) String code



,@ApiParam(value = "Unique Id of designation") @RequestParam(value = "id", required = false) List<Integer> id



,@ApiParam(value = "True will be set in cases where only active designation are needed and False will be set when inactive designation are needed and no value will be set when all designation are needed.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



);

}
