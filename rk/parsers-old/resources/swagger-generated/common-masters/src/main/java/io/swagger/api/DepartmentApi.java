package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.DepartmentReq;
import io.swagger.model.DepartmentRes;

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

@Api(value = "department", description = "the department API")
public interface DepartmentApi {

    @ApiOperation(value = "Delete a particular department master data.", notes = "To delete an existing department master data one nees to make it inactive. System should not allow physical deletion of data.", response = Void.class, tags={ "Department", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Department deleted.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = Void.class),
        @ApiResponse(code = 404, message = "Department not found.", response = Void.class) })
    @RequestMapping(value = "/department/{code}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> departmentCodeDelete(
@ApiParam(value = "The code of the department master.",required=true ) @PathVariable("code") String code


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the department to be deleted" ,required=true ) @RequestBody RequestInfo department

);


    @ApiOperation(value = "Update existing department data for the code passed", notes = "To update an existing department master data.", response = DepartmentRes.class, tags={ "Department", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Department updated.", response = DepartmentRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = DepartmentRes.class),
        @ApiResponse(code = 404, message = "Department not found.", response = DepartmentRes.class) })
    @RequestMapping(value = "/department/{code}",
        method = RequestMethod.PUT)
    ResponseEntity<DepartmentRes> departmentCodePut(
@ApiParam(value = "The code of the department master.",required=true ) @PathVariable("code") String code


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the department with new of values." ,required=true ) @RequestBody DepartmentReq department

);

}
