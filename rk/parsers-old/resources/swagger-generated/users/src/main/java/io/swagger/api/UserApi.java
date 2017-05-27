package io.swagger.api;

import io.swagger.model.LoginResponse;
import io.swagger.model.ErrorRes;
import io.swagger.model.ResponseInfo;
import io.swagger.model.RequestInfo;
import io.swagger.model.UserReq;
import io.swagger.model.UserRes;

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

@Api(value = "user", description = "the user API")
public interface UserApi {

    @ApiOperation(value = "Login a user based on username and password auth and return oAuth tokens.", notes = "Login a user based on username and password auth and return oAuth tokens.", response = LoginResponse.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User logged in.", response = LoginResponse.class),
        @ApiResponse(code = 400, message = "Could not login - Invalid Credentials.", response = LoginResponse.class),
        @ApiResponse(code = 200, message = "Login failed.", response = LoginResponse.class) })
    @RequestMapping(value = "/user/login",
        method = RequestMethod.POST)
    ResponseEntity<LoginResponse> userLoginPost(@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantId", required = true) String tenantId



,@ApiParam(value = "The unique user name of the User.", required = true) @RequestParam(value = "userName", required = true) String userName



,@ApiParam(value = "The password of the user name to login to the system.", required = true) @RequestParam(value = "password", required = true) String password



);


    @ApiOperation(value = "Logout a user based on access token auth", notes = "Logout a user based on access token auth", response = ResponseInfo.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User logged out successfully.", response = ResponseInfo.class),
        @ApiResponse(code = 200, message = "Logout failed.", response = ResponseInfo.class) })
    @RequestMapping(value = "/user/logout",
        method = RequestMethod.POST)
    ResponseEntity<ResponseInfo> userLogoutPost(@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantId", required = true) String tenantId



,

@ApiParam(value = "Request for logout using access token" ,required=true ) @RequestBody RequestInfo logoutRequest

);


    @ApiOperation(value = "Update existing user master data for the User using the unique user name.", notes = "To update an existing User master data.", response = UserRes.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User updated.", response = UserRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = UserRes.class),
        @ApiResponse(code = 404, message = "User not found.", response = UserRes.class) })
    @RequestMapping(value = "/user/{userName}",
        method = RequestMethod.PUT)
    ResponseEntity<UserRes> userUserNamePut(
@ApiParam(value = "The unique user name with which the user login.",required=true ) @PathVariable("userName") String userName


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantId", required = true) String tenantId



,

@ApiParam(value = "Request header for the user with new of values." ,required=true ) @RequestBody UserReq user

);

}
