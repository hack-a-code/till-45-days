package io.swagger.api;

import io.swagger.model.LeaveTypeRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.LeaveTypeReq;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

@Api(value = "leavetypes", description = "the leavetypes API")
public interface LeavetypesApi {

    @ApiOperation(value = "Get the Leave Types defined in the system.", notes = "All the leave type master data can be fetched one shot using GET, or else by passing name/id one can get a specific leave data. ", response = LeaveTypeRes.class, tags={ "Leave Type", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = LeaveTypeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LeaveTypeRes.class),
        @ApiResponse(code = 404, message = "Leave Type not found.", response = LeaveTypeRes.class) })
    @RequestMapping(value = "/leavetypes",
        method = RequestMethod.GET)
    ResponseEntity<LeaveTypeRes> leavetypesGet(

@ApiParam(value = "Commmon request info for getting leave types." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Unique id for leave type.") @RequestParam(value = "id", required = false) String id



,@ApiParam(value = "Will be set to TRUE only if active leave types are required.") @RequestParam(value = "active", required = false) String active



,@ApiParam(value = "Result will be sorted by leave name ascending by default if this parameter is not provided.", defaultValue = "[+name]") @RequestParam(value = "sort", required = false, defaultValue="[+name]") List<String> sort



);


    @ApiOperation(value = "Create a new leave type.", notes = "To create a leave type master data we can use POST and set all the required and non-mandatory parameters.", response = LeaveTypeRes.class, tags={ "Leave Type", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Leave Type created sucessfully.", response = LeaveTypeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LeaveTypeRes.class) })
    @RequestMapping(value = "/leavetypes",
        method = RequestMethod.POST)
    ResponseEntity<LeaveTypeRes> leavetypesPost(

@ApiParam(value = "Details for the new leave type ." ,required=true ) @RequestBody LeaveTypeReq leaveType

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



);

}
