package io.swagger.api;

import io.swagger.model.HRStatusRes;
import io.swagger.model.ErrorRes;
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
public class HrstatusesApiController implements HrstatusesApi {

    public ResponseEntity<HRStatusRes> hrstatusesSearchPost(

@ApiParam(value = "Commmon request info for getting status." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Name of the object/entity for which status is searched for.") @RequestParam(value = "objectName", required = false) String objectName



,
        @ApiParam(value = "List of Unique Id of status master.") @RequestParam(value = "id", required = false) List<Integer> id



,
        @ApiParam(value = "Name of the status code.") @RequestParam(value = "code", required = false) String code



,
        @ApiParam(value = "Status list search results will be sorted by objectName and code ascending by default.") @RequestParam(value = "sort", required = false) List<String> sort



) {
        // do some magic!
        return new ResponseEntity<HRStatusRes>(HttpStatus.OK);
    }

}
