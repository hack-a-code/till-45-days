package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.HRConfigurationRes;
import io.swagger.model.RequestInfo;
import org.joda.time.LocalDate;

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

@Api(value = "hrconfigurations", description = "the hrconfigurations API")
public interface HrconfigurationsApi {

    @ApiOperation(value = "Get the list of configuration paramaters along with the values defined in the system for entire HR module.", notes = "Get the configuration key data and the list of  values for each key. To get a particular configuration key values one can pass the key name. Date also needs to be passed along to get the appropriate values. ", response = HRConfigurationRes.class, tags={ "Set Up", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response.", response = HRConfigurationRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = HRConfigurationRes.class) })
    @RequestMapping(value = "/hrconfigurations/_search",
        method = RequestMethod.POST)
    ResponseEntity<HRConfigurationRes> hrconfigurationsSearchPost(

@ApiParam(value = "Commmon request info for getting configuration key." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "List of Key Name for which configuration values are required.") @RequestParam(value = "name", required = false) List<String> name



,@ApiParam(value = "List of Unique Id of configuration.") @RequestParam(value = "id", required = false) List<Integer> id



,@ApiParam(value = "The date for which the configuration value is applicable.") @RequestParam(value = "effectiveFrom", required = false) LocalDate effectiveFrom



,@ApiParam(value = "Configuration Key search results will be sorted by key name ascending and effectiveFrom descending by default.") @RequestParam(value = "sort", required = false) List<String> sort



);

}
