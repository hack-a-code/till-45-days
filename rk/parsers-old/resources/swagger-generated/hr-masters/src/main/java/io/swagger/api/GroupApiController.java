package io.swagger.api;

import io.swagger.model.GroupReq;
import io.swagger.model.GroupRes;
import io.swagger.model.ErrorRes;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

@Controller
public class GroupApiController implements GroupApi {

    public ResponseEntity<GroupRes> groupGroupIdUpdatePost(

@ApiParam(value = "Request header for the employee group to be updated." ,required=true ) @RequestBody GroupReq employeeGroup

,
        
@ApiParam(value = "The unique Id of the employee group",required=true ) @PathVariable("groupId") Long groupId


) {
        // do some magic!
        return new ResponseEntity<GroupRes>(HttpStatus.OK);
    }

}
