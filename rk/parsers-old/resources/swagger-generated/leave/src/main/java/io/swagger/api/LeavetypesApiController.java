package io.swagger.api;

import io.swagger.model.LeaveTypeRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.LeaveTypeReq;

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
public class LeavetypesApiController implements LeavetypesApi {

    public ResponseEntity<LeaveTypeRes> leavetypesGet(

@ApiParam(value = "Commmon request info for getting leave types." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Unique id for leave type.") @RequestParam(value = "id", required = false) String id



,
        @ApiParam(value = "Will be set to TRUE only if active leave types are required.") @RequestParam(value = "active", required = false) String active



,
        @ApiParam(value = "Result will be sorted by leave name ascending by default if this parameter is not provided.", defaultValue = "[+name]") @RequestParam(value = "sort", required = false, defaultValue="[+name]") List<String> sort



) {
        // do some magic!
        return new ResponseEntity<LeaveTypeRes>(HttpStatus.OK);
    }

    public ResponseEntity<LeaveTypeRes> leavetypesPost(

@ApiParam(value = "Details for the new leave type ." ,required=true ) @RequestBody LeaveTypeReq leaveType

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



) {
        // do some magic!
        return new ResponseEntity<LeaveTypeRes>(HttpStatus.OK);
    }

}
