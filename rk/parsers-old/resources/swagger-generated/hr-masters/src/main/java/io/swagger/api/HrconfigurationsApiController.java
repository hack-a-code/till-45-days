package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.HRConfigurationRes;
import io.swagger.model.RequestInfo;
import org.joda.time.LocalDate;

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
public class HrconfigurationsApiController implements HrconfigurationsApi {

    public ResponseEntity<HRConfigurationRes> hrconfigurationsSearchPost(

@ApiParam(value = "Commmon request info for getting configuration key." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "List of Key Name for which configuration values are required.") @RequestParam(value = "name", required = false) List<String> name



,
        @ApiParam(value = "List of Unique Id of configuration.") @RequestParam(value = "id", required = false) List<Integer> id



,
        @ApiParam(value = "The date for which the configuration value is applicable.") @RequestParam(value = "effectiveFrom", required = false) LocalDate effectiveFrom



,
        @ApiParam(value = "Configuration Key search results will be sorted by key name ascending and effectiveFrom descending by default.") @RequestParam(value = "sort", required = false) List<String> sort



) {
        // do some magic!
        return new ResponseEntity<HRConfigurationRes>(HttpStatus.OK);
    }

}
