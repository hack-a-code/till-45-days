package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.AssetResponse;
import io.swagger.model.RequestInfo;
import io.swagger.model.Asset;
import io.swagger.model.AssetRequest;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-27T11:12:03.168+05:30")

@Api(value = "assets", description = "the assets API")
public interface AssetsApi {

    @ApiOperation(value = "Get Asset List", notes = "Provides a list of asset for given different input params. ", response = AssetResponse.class, tags={ "Asset", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "returns list of Asset.", response = AssetResponse.class),
        @ApiResponse(code = 400, message = "tenant_id was not provided or General service error", response = AssetResponse.class),
        @ApiResponse(code = 404, message = "tenant_id provided was not found", response = AssetResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = AssetResponse.class) })
    @RequestMapping(value = "/assets",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<AssetResponse> assetsGet(

@ApiParam(value = "Request header for the service request details." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for ulb.", required = true) @RequestParam(value = "tenantId", required = true) String tenantId



,@ApiParam(value = "Assset id.") @RequestParam(value = "id", required = false) Long id



,@ApiParam(value = "Assset name.") @RequestParam(value = "name", required = false) String name



,@ApiParam(value = "Unique Asset code.") @RequestParam(value = "code", required = false) String code



,@ApiParam(value = "Category of the Asset.") @RequestParam(value = "assetCategory", required = false) String assetCategory



,@ApiParam(value = "Department of the user.") @RequestParam(value = "department", required = false) String department



,@ApiParam(value = "Asset status.") @RequestParam(value = "status", required = false) String status



);


    @ApiOperation(value = "Create Asset", notes = "To create a new Asset.", response = Asset.class, tags={ "Asset", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Asset created", response = Asset.class),
        @ApiResponse(code = 400, message = "tenant_id was not provided or General service error", response = Asset.class),
        @ApiResponse(code = 404, message = "tenant_id provided was not found", response = Asset.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Asset.class) })
    @RequestMapping(value = "/assets",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Asset> assetsPost(

@ApiParam(value = "Details for the new Aset." ,required=true ) @RequestBody AssetRequest asset

,@ApiParam(value = "Unique id for tenant.", required = true) @RequestParam(value = "tenantId", required = true) String tenantId



);

}
