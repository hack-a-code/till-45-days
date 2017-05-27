package io.swagger.api;

import io.swagger.model.GroupReq;
import io.swagger.model.GroupRes;
import io.swagger.model.ErrorRes;

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

@Api(value = "group", description = "the group API")
public interface GroupApi {

    @ApiOperation(value = "Update an existing employee group.", notes = "To update an existing employee group master data.", response = GroupRes.class, tags={ "Employee Group", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Employee group updated.", response = GroupRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = GroupRes.class) })
    @RequestMapping(value = "/group/{groupId}/_update",
        method = RequestMethod.POST)
    ResponseEntity<GroupRes> groupGroupIdUpdatePost(

@ApiParam(value = "Request header for the employee group to be updated." ,required=true ) @RequestBody GroupReq employeeGroup

,
@ApiParam(value = "The unique Id of the employee group",required=true ) @PathVariable("groupId") Long groupId


);

}
