package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.AssetResponse;
import io.swagger.model.RequestInfo;
import io.swagger.model.Asset;
import io.swagger.model.AssetRequest;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-27T11:12:03.168+05:30")

@Controller
public class AssetsApiController implements AssetsApi {

    public ResponseEntity<AssetResponse> assetsGet(

@ApiParam(value = "Request header for the service request details." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for ulb.", required = true) @RequestParam(value = "tenantId", required = true) String tenantId



,
        @ApiParam(value = "Assset id.") @RequestParam(value = "id", required = false) Long id



,
        @ApiParam(value = "Assset name.") @RequestParam(value = "name", required = false) String name



,
        @ApiParam(value = "Unique Asset code.") @RequestParam(value = "code", required = false) String code



,
        @ApiParam(value = "Category of the Asset.") @RequestParam(value = "assetCategory", required = false) String assetCategory



,
        @ApiParam(value = "Department of the user.") @RequestParam(value = "department", required = false) String department



,
        @ApiParam(value = "Asset status.") @RequestParam(value = "status", required = false) String status



) {
        // do some magic!
        return new ResponseEntity<AssetResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Asset> assetsPost(

@ApiParam(value = "Details for the new Aset." ,required=true ) @RequestBody AssetRequest asset

,
        @ApiParam(value = "Unique id for tenant.", required = true) @RequestParam(value = "tenantId", required = true) String tenantId



) {
        // do some magic!
        return new ResponseEntity<Asset>(HttpStatus.OK);
    }

}
