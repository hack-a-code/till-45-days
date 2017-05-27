package io.swagger.api;

import io.swagger.model.DesignationRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.DesignationReq;
import io.swagger.model.RequestInfo;

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
public class DesignationsApiController implements DesignationsApi {

    public ResponseEntity<DesignationRes> designationsCreatePost(

@ApiParam(value = "Details for the new designation ." ,required=true ) @RequestBody DesignationReq designation

) {
        // do some magic!
        return new ResponseEntity<DesignationRes>(HttpStatus.OK);
    }

    public ResponseEntity<DesignationRes> designationsSearchPost(

@ApiParam(value = "Commmon request info for getting designation." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Designation results will be sorted by name ascending by default if this parameter is not provided.", defaultValue = "[+name]") @RequestParam(value = "sort", required = false, defaultValue="[+name]") List<String> sort



,
        @ApiParam(value = "Name of the designation.") @RequestParam(value = "name", required = false) String name



,
        @ApiParam(value = "Unique code of the designation.") @RequestParam(value = "code", required = false) String code



,
        @ApiParam(value = "Unique Id of designation") @RequestParam(value = "id", required = false) List<Integer> id



,
        @ApiParam(value = "True will be set in cases where only active designation are needed and False will be set when inactive designation are needed and no value will be set when all designation are needed.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



) {
        // do some magic!
        return new ResponseEntity<DesignationRes>(HttpStatus.OK);
    }

}
