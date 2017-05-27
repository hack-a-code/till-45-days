package io.swagger.api;

import io.swagger.model.DepartmentRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.DepartmentReq;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

@Api(value = "departments", description = "the departments API")
public interface DepartmentsApi {

    @ApiOperation(value = "Get the list of departments defined in the system or a particular department.", notes = "Get the department master data for the parameter values.", response = DepartmentRes.class, tags={ "Department", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = DepartmentRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = DepartmentRes.class),
        @ApiResponse(code = 404, message = "Department not found.", response = DepartmentRes.class) })
    @RequestMapping(value = "/departments",
        method = RequestMethod.GET)
    ResponseEntity<DepartmentRes> departmentsGet(

@ApiParam(value = "Commmon request info for getting department." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Code of the department.") @RequestParam(value = "code", required = false) String code



,@ApiParam(value = "True will be set in cases where only active departments are needed and False will be set when inactive departments are needed and no value will be set when all departments are needed.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



,@ApiParam(value = "Unique Id of department") @RequestParam(value = "id", required = false) Long id



);


    @ApiOperation(value = "Create a new Department.", notes = "To create a new department we need to call POST.", response = DepartmentRes.class, tags={ "Department", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Department created sucessfully.", response = DepartmentRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = DepartmentRes.class) })
    @RequestMapping(value = "/departments",
        method = RequestMethod.POST)
    ResponseEntity<DepartmentRes> departmentsPost(

@ApiParam(value = "Details for the new department ." ,required=true ) @RequestBody DepartmentReq department

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



);

}
