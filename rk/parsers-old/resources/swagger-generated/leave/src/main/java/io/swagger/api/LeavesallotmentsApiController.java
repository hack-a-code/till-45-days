package io.swagger.api;

import io.swagger.model.LeaveAllotmentReq;
import io.swagger.model.ErrorRes;
import io.swagger.model.LeaveAllotmentRes;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

@Controller
public class LeavesallotmentsApiController implements LeavesallotmentsApi {

    public ResponseEntity<Void> leavesallotmentsLeavetypeIdDelete(
@ApiParam(value = "The id of the leave type master.",required=true ) @PathVariable("leavetypeId") Long leavetypeId


,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the leave allotment to be deleted" ,required=true ) @RequestBody LeaveAllotmentReq leaveAllocation

,
        @ApiParam(value = "The id of the designation master.") @RequestParam(value = "designationId", required = false) Long designationId



) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<LeaveAllotmentRes> leavesallotmentsLeavetypeIdPut(
@ApiParam(value = "The id of the leave type master.",required=true ) @PathVariable("leavetypeId") Long leavetypeId


,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the leave allotment with new set of values." ,required=true ) @RequestBody LeaveAllotmentReq leaveAllocation

,
        @ApiParam(value = "The id of the designation master.") @RequestParam(value = "designationId", required = false) Long designationId



) {
        // do some magic!
        return new ResponseEntity<LeaveAllotmentRes>(HttpStatus.OK);
    }

}
