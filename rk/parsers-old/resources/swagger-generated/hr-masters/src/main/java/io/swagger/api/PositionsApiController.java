package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.PositionReq;
import io.swagger.model.PositionRes;
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
public class PositionsApiController implements PositionsApi {

    public ResponseEntity<PositionRes> positionsCreatePost(

@ApiParam(value = "Details for the new position ." ,required=true ) @RequestBody PositionReq position

) {
        // do some magic!
        return new ResponseEntity<PositionRes>(HttpStatus.OK);
    }

    public ResponseEntity<PositionRes> positionsSearchPost(

@ApiParam(value = "Commmon request info for getting position." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Name of the position.") @RequestParam(value = "name", required = false) String name



,
        @ApiParam(value = "Unique Id of position") @RequestParam(value = "id", required = false) List<Integer> id



,
        @ApiParam(value = "Unique id of the department associated with the position.") @RequestParam(value = "deptdesigDepartmentId", required = false) Long deptdesigDepartmentId



,
        @ApiParam(value = "Unique id of the designation associated with the position.") @RequestParam(value = "deptdesigDesignationId", required = false) Long deptdesigDesignationId



,
        @ApiParam(value = "True will be set in cases where only active position are needed and False will be set when inactive position are needed and no value will be set when all positions are needed.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



,
        @ApiParam(value = "Position search results will be sorted by name ascending by default if this parameter is not provided.", defaultValue = "[+name]") @RequestParam(value = "sort", required = false, defaultValue="[+name]") List<String> sort



) {
        // do some magic!
        return new ResponseEntity<PositionRes>(HttpStatus.OK);
    }

}
