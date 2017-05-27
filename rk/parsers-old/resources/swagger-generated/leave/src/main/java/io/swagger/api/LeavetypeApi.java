package io.swagger.api;

import io.swagger.model.LeaveTypeReq;
import io.swagger.model.LeaveTypeRes;
import io.swagger.model.ErrorRes;

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

@Api(value = "leavetype", description = "the leavetype API")
public interface LeavetypeApi {

    @ApiOperation(value = "Update existing leave type details.", notes = "To update an existing leave type master data.", response = LeaveTypeRes.class, tags={ "Leave Type", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Leave Type updated.", response = LeaveTypeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LeaveTypeRes.class),
        @ApiResponse(code = 404, message = "Leave type not found.", response = LeaveTypeRes.class) })
    @RequestMapping(value = "/leavetype/{leavetypeId}",
        method = RequestMethod.PUT)
    ResponseEntity<LeaveTypeRes> leavetypeLeavetypeIdPut(
@ApiParam(value = "The id of the leave type master.",required=true ) @PathVariable("leavetypeId") Long leavetypeId


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the leave type with new of values." ,required=true ) @RequestBody LeaveTypeReq leaveType

);

}
