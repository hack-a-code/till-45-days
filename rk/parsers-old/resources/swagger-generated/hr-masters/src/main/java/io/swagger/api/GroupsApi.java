package io.swagger.api;

import io.swagger.model.GroupReq;
import io.swagger.model.GroupRes;
import io.swagger.model.ErrorRes;
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

@Api(value = "groups", description = "the groups API")
public interface GroupsApi {

    @ApiOperation(value = "Create a new employee group to the master list.", notes = "To create a new employee group we can use POST and set all the required and non-mandatory parameters.", response = GroupRes.class, tags={ "Employee Group", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Employee group created sucessfully.", response = GroupRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = GroupRes.class) })
    @RequestMapping(value = "/groups/_create",
        method = RequestMethod.POST)
    ResponseEntity<GroupRes> groupsCreatePost(

@ApiParam(value = "Details for the new employee group ." ,required=true ) @RequestBody GroupReq employeeGroup

);


    @ApiOperation(value = "Get the list of employee groups defined in the system.", notes = "Get the employee group data. To get a particular employee group one can pass the name. ", response = GroupRes.class, tags={ "Employee Group", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response.", response = GroupRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = GroupRes.class) })
    @RequestMapping(value = "/groups/_search",
        method = RequestMethod.POST)
    ResponseEntity<GroupRes> groupsSearchPost(

@ApiParam(value = "Commmon request info for getting employee group." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Name of the employee group.") @RequestParam(value = "name", required = false) String name



,@ApiParam(value = "List of Unique Id of employee group") @RequestParam(value = "id", required = false) List<Integer> id



,@ApiParam(value = "Employee group search results will be sorted by name ascending by default.") @RequestParam(value = "sort", required = false) List<String> sort



);

}
