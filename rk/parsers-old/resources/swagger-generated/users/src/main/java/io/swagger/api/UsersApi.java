package io.swagger.api;

import io.swagger.model.UserRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.UserReq;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T10:24:23.947+05:30")

@Api(value = "users", description = "the users API")
public interface UsersApi {

    @ApiOperation(value = "Get the list of users defined in the system.", notes = "Get the user list based on the input parameters. ", response = UserRes.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = UserRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = UserRes.class),
        @ApiResponse(code = 404, message = "User does not exist.", response = UserRes.class) })
    @RequestMapping(value = "/users",
        method = RequestMethod.GET)
    ResponseEntity<UserRes> usersGet(

@ApiParam(value = "Commmon request info for getting user." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantId", required = true) String tenantId



,@ApiParam(value = "The unique user name of the User.") @RequestParam(value = "userName", required = false) String userName



,@ApiParam(value = "True will be set in cases where only active users are needed and False will be set when inactive users are needed and no value will be set when all users are needed.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



,@ApiParam(value = "Number of records returned.", defaultValue = "20") @RequestParam(value = "pageSize", required = false, defaultValue="20") Integer pageSize



,@ApiParam(value = "Page number", defaultValue = "1") @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber



,@ApiParam(value = "User results will be sorted by name ascending by default if this parameter is not provided.", defaultValue = "[+name]") @RequestParam(value = "sort", required = false, defaultValue="[+name]") List<String> sort



,@ApiParam(value = "Unique Id of User") @RequestParam(value = "id", required = false) Long id



);


    @ApiOperation(value = "Create a new User.", notes = "To create a new User in the system.", response = UserRes.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "User created sucessfully.", response = UserRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = UserRes.class) })
    @RequestMapping(value = "/users",
        method = RequestMethod.POST)
    ResponseEntity<UserRes> usersPost(

@ApiParam(value = "Details for the new user ." ,required=true ) @RequestBody UserReq user

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantId", required = true) String tenantId



);

}
