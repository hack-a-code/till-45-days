package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.CommunityRes;
import io.swagger.model.CommunityReq;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

@Controller
public class CommunityApiController implements CommunityApi {

    public ResponseEntity<Void> communityNameDelete(
@ApiParam(value = "The name of the community.",required=true ) @PathVariable("name") String name


,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the community to be deleted" ,required=true ) @RequestBody RequestInfo community

) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<CommunityRes> communityNamePut(
@ApiParam(value = "The name of the community.",required=true ) @PathVariable("name") String name


,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the community with new of values." ,required=true ) @RequestBody CommunityReq community

) {
        // do some magic!
        return new ResponseEntity<CommunityRes>(HttpStatus.OK);
    }

}
