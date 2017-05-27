package io.swagger.api;

import io.swagger.model.LoginResponse;
import io.swagger.model.ErrorRes;
import io.swagger.model.ResponseInfo;
import io.swagger.model.RequestInfo;
import io.swagger.model.UserReq;
import io.swagger.model.UserRes;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T10:24:23.947+05:30")

@Controller
public class UserApiController implements UserApi {

    public ResponseEntity<LoginResponse> userLoginPost(@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantId", required = true) String tenantId



,
        @ApiParam(value = "The unique user name of the User.", required = true) @RequestParam(value = "userName", required = true) String userName



,
        @ApiParam(value = "The password of the user name to login to the system.", required = true) @RequestParam(value = "password", required = true) String password



) {
        // do some magic!
        return new ResponseEntity<LoginResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ResponseInfo> userLogoutPost(@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantId", required = true) String tenantId



,
        

@ApiParam(value = "Request for logout using access token" ,required=true ) @RequestBody RequestInfo logoutRequest

) {
        // do some magic!
        return new ResponseEntity<ResponseInfo>(HttpStatus.OK);
    }

    public ResponseEntity<UserRes> userUserNamePut(
@ApiParam(value = "The unique user name with which the user login.",required=true ) @PathVariable("userName") String userName


,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantId", required = true) String tenantId



,
        

@ApiParam(value = "Request header for the user with new of values." ,required=true ) @RequestBody UserReq user

) {
        // do some magic!
        return new ResponseEntity<UserRes>(HttpStatus.OK);
    }

}
