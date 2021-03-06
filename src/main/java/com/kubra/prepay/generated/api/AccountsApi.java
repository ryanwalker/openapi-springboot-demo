/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.kubra.prepay.generated.api;

import com.kubra.prepay.generated.model.AccountDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-24T16:35:28.120441-07:00[America/Phoenix]")

@Validated
@Api(value = "accounts", description = "the accounts API")
public interface AccountsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Register an account", nickname = "registerAccount", notes = "Register an account", response = AccountDto.class, tags={ "accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = AccountDto.class) })
    @RequestMapping(value = "/accounts",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<AccountDto> registerAccount(@ApiParam(value = "Account request body" ,required=true )  @Valid @RequestBody AccountDto accountDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"balance\" : 0.80082819046101150206595775671303272247314453125,  \"contactInfo\" : [ {    \"isPrimary\" : true,    \"name\" : \"name\",    \"contactType\" : \"EMAIL\",    \"value\" : \"value\"  }, {    \"isPrimary\" : true,    \"name\" : \"name\",    \"contactType\" : \"EMAIL\",    \"value\" : \"value\"  } ],  \"accountType\" : \"accountType\",  \"id\" : \"id\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
