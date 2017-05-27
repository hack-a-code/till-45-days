package io.swagger.api;

import io.swagger.model.EmployeeTypeRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.EmployeeTypeReq;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

@Api(value = "employeetype", description = "the employeetype API")
public interface EmployeetypeApi {

    @ApiOperation(value = "Update an existing employee type.", notes = "To update an existing employee type master data.", response = EmployeeTypeRes.class, tags={ "Employee Type", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Employee Type updated.", response = EmployeeTypeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = EmployeeTypeRes.class) })
    @RequestMapping(value = "/employeetype/{employeetypeId}/_update",
        method = RequestMethod.POST)
    ResponseEntity<EmployeeTypeRes> employeetypeEmployeetypeIdUpdatePost(

@ApiParam(value = "Request header for the employee type to be updated." ,required=true ) @RequestBody EmployeeTypeReq employeeType

,
@ApiParam(value = "The unique Id of the employee type",required=true ) @PathVariable("employeetypeId") Long employeetypeId


);

}
