package io.swagger.api;

import io.swagger.model.LeaveAllotmentReq;
import io.swagger.model.ErrorRes;
import io.swagger.model.LeaveAllotmentRes;

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

@Api(value = "leavesallotments", description = "the leavesallotments API")
public interface LeavesallotmentsApi {

    @ApiOperation(value = "Delete the leaves allocation for a particular leave type.", notes = "To delete a set of existing leave allocation data for a leave type or for deleting the leave allocation for a specific combination of designation and leave type we can use DELETE.", response = Void.class, tags={ "Leave Allotment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Leave allotment deleted.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = Void.class),
        @ApiResponse(code = 404, message = "Leave allotment not found.", response = Void.class) })
    @RequestMapping(value = "/leavesallotments/{leavetypeId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> leavesallotmentsLeavetypeIdDelete(
@ApiParam(value = "The id of the leave type master.",required=true ) @PathVariable("leavetypeId") Long leavetypeId


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the leave allotment to be deleted" ,required=true ) @RequestBody LeaveAllotmentReq leaveAllocation

,@ApiParam(value = "The id of the designation master.") @RequestParam(value = "designationId", required = false) Long designationId



);


    @ApiOperation(value = "Update existing leave details for the designation and leave type", notes = "To update a set of leave allocation for a particular leave type or for updating a specific leave types' data for a specific designation we can use PUT.", response = LeaveAllotmentRes.class, tags={ "Leave Allotment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Leave Allotment updated.", response = LeaveAllotmentRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LeaveAllotmentRes.class),
        @ApiResponse(code = 404, message = "Leave Allotment details not found.", response = LeaveAllotmentRes.class) })
    @RequestMapping(value = "/leavesallotments/{leavetypeId}",
        method = RequestMethod.PUT)
    ResponseEntity<LeaveAllotmentRes> leavesallotmentsLeavetypeIdPut(
@ApiParam(value = "The id of the leave type master.",required=true ) @PathVariable("leavetypeId") Long leavetypeId


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the leave allotment with new set of values." ,required=true ) @RequestBody LeaveAllotmentReq leaveAllocation

,@ApiParam(value = "The id of the designation master.") @RequestParam(value = "designationId", required = false) Long designationId



);

}
