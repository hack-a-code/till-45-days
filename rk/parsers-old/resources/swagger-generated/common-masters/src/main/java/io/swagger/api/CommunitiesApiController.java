package io.swagger.api;

import io.swagger.model.CommunityRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
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
public class CommunitiesApiController implements CommunitiesApi {

    public ResponseEntity<CommunityRes> communitiesGet(

@ApiParam(value = "Commmon request info for getting community." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Name of the community.") @RequestParam(value = "name", required = false) String name



,
        @ApiParam(value = "True will be set in cases where only active communities are needed and False will be set when inactive communities are needed and no value will be set when all communities are needed.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



,
        @ApiParam(value = "Unique Id of communities") @RequestParam(value = "id", required = false) Long id



) {
        // do some magic!
        return new ResponseEntity<CommunityRes>(HttpStatus.OK);
    }

    public ResponseEntity<CommunityRes> communitiesPost(

@ApiParam(value = "Details for the new community ." ,required=true ) @RequestBody CommunityReq community

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



) {
        // do some magic!
        return new ResponseEntity<CommunityRes>(HttpStatus.OK);
    }

}
