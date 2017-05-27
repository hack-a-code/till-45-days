package io.swagger.api;

import io.swagger.model.LeaveAllotmentRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.LeaveAllotmentReq;

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

@Api(value = "leaveallotments", description = "the leaveallotments API")
public interface LeaveallotmentsApi {

    @ApiOperation(value = "Get the leave allocation defined in the system.", notes = "Get the leave allocation defined in the system for each leave type for each designation. ", response = LeaveAllotmentRes.class, tags={ "Leave Allotment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = LeaveAllotmentRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LeaveAllotmentRes.class),
        @ApiResponse(code = 404, message = "Leave Allotment not found.", response = LeaveAllotmentRes.class) })
    @RequestMapping(value = "/leaveallotments",
        method = RequestMethod.GET)
    ResponseEntity<LeaveAllotmentRes> leaveallotmentsGet(

@ApiParam(value = "Commmon request info for getting leave allocation." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Unique id of the leave type.") @RequestParam(value = "leaveType", required = false) String leaveType



,@ApiParam(value = "Unique id for designation.") @RequestParam(value = "designationId", required = false) String designationId



,@ApiParam(value = "Result will be sorted by leave name ascending by default if this parameter is not provided.", defaultValue = "[+name]") @RequestParam(value = "sort", required = false, defaultValue="[+name]") List<String> sort



,@ApiParam(value = "Number of records returned.", defaultValue = "50") @RequestParam(value = "pageSize", required = false, defaultValue="50") Integer pageSize



,@ApiParam(value = "Page number", defaultValue = "1") @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber



);


    @ApiOperation(value = "Create new set of leave allocation.", notes = "To create a new set of leave allocation designation wise one can use POST.", response = LeaveAllotmentRes.class, tags={ "Leave Allotment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Leave allotment created sucessfully.", response = LeaveAllotmentRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LeaveAllotmentRes.class) })
    @RequestMapping(value = "/leaveallotments",
        method = RequestMethod.POST)
    ResponseEntity<LeaveAllotmentRes> leaveallotmentsPost(

@ApiParam(value = "Details for the new set of leave allotment data designation wise." ,required=true ) @RequestBody LeaveAllotmentReq leaveAllotment

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



);

}
