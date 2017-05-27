package io.swagger.api;

import io.swagger.model.LeaveAllotmentRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.LeaveAllotmentReq;

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
public class LeaveallotmentsApiController implements LeaveallotmentsApi {

    public ResponseEntity<LeaveAllotmentRes> leaveallotmentsGet(

@ApiParam(value = "Commmon request info for getting leave allocation." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Unique id of the leave type.") @RequestParam(value = "leaveType", required = false) String leaveType



,
        @ApiParam(value = "Unique id for designation.") @RequestParam(value = "designationId", required = false) String designationId



,
        @ApiParam(value = "Result will be sorted by leave name ascending by default if this parameter is not provided.", defaultValue = "[+name]") @RequestParam(value = "sort", required = false, defaultValue="[+name]") List<String> sort



,
        @ApiParam(value = "Number of records returned.", defaultValue = "50") @RequestParam(value = "pageSize", required = false, defaultValue="50") Integer pageSize



,
        @ApiParam(value = "Page number", defaultValue = "1") @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber



) {
        // do some magic!
        return new ResponseEntity<LeaveAllotmentRes>(HttpStatus.OK);
    }

    public ResponseEntity<LeaveAllotmentRes> leaveallotmentsPost(

@ApiParam(value = "Details for the new set of leave allotment data designation wise." ,required=true ) @RequestBody LeaveAllotmentReq leaveAllotment

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



) {
        // do some magic!
        return new ResponseEntity<LeaveAllotmentRes>(HttpStatus.OK);
    }

}
