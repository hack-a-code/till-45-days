package io.swagger.api;

import io.swagger.model.DepartmentRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.DepartmentReq;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

@Controller
public class DepartmentsApiController implements DepartmentsApi {

    public ResponseEntity<DepartmentRes> departmentsGet(

@ApiParam(value = "Commmon request info for getting department." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Code of the department.") @RequestParam(value = "code", required = false) String code



,
        @ApiParam(value = "True will be set in cases where only active departments are needed and False will be set when inactive departments are needed and no value will be set when all departments are needed.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



,
        @ApiParam(value = "Unique Id of department") @RequestParam(value = "id", required = false) Long id



) {
        // do some magic!
        return new ResponseEntity<DepartmentRes>(HttpStatus.OK);
    }

    public ResponseEntity<DepartmentRes> departmentsPost(

@ApiParam(value = "Details for the new department ." ,required=true ) @RequestBody DepartmentReq department

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



) {
        // do some magic!
        return new ResponseEntity<DepartmentRes>(HttpStatus.OK);
    }

}
