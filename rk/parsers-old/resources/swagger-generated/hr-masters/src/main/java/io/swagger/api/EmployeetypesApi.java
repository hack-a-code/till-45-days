package io.swagger.api;

import io.swagger.model.EmployeeTypeRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.EmployeeTypeReq;
import io.swagger.model.RequestInfo;

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

@Api(value = "employeetypes", description = "the employeetypes API")
public interface EmployeetypesApi {

    @ApiOperation(value = "Create a new employee type to the master list.", notes = "To create a new employee type we can use POST and set all the required and non-mandatory parameters.", response = EmployeeTypeRes.class, tags={ "Employee Type", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Employee Type created sucessfully.", response = EmployeeTypeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = EmployeeTypeRes.class) })
    @RequestMapping(value = "/employeetypes/_create",
        method = RequestMethod.POST)
    ResponseEntity<EmployeeTypeRes> employeetypesCreatePost(

@ApiParam(value = "Details for the new employee type ." ,required=true ) @RequestBody EmployeeTypeReq employeeType

);


    @ApiOperation(value = "Get the list of employee types defined in the system.", notes = "Get the employee type data. To get a particular employee type one can pass the name. ", response = EmployeeTypeRes.class, tags={ "Employee Type", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response.", response = EmployeeTypeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = EmployeeTypeRes.class) })
    @RequestMapping(value = "/employeetypes/_search",
        method = RequestMethod.POST)
    ResponseEntity<EmployeeTypeRes> employeetypesSearchPost(

@ApiParam(value = "Commmon request info for getting employee type." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Name of the employee type.") @RequestParam(value = "name", required = false) String name



,@ApiParam(value = "List of Unique Id of employee type") @RequestParam(value = "id", required = false) List<Integer> id



,@ApiParam(value = "Employee Type search results will be sorted by name ascending by default if this parameter is not provided.") @RequestParam(value = "sort", required = false) List<String> sort



);

}
