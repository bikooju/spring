package umc_spring.spring.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc_spring.spring.apiPayload.ApiResponse;
import umc_spring.spring.converter.TempConverter;
import umc_spring.spring.service.TempService.TempQueryService;
import umc_spring.spring.web.dto.TempResponse;

import static com.sun.tools.classfile.Attribute.Code;

@RestController
@RequestMapping("/temp")
@RequiredArgsConstructor
public class TempRestController {

    private final TempQueryService tempQueryService;

    @GetMapping("/test")
    public ResponseDto<TempResponse.TempTestDTO> testAPI(){

        return ResponseDto.onSuccess(TempConverter.toTempTestDTO(), Code.OK);
    }

    @GetMapping("/exception")
    public ApiResponse<TempResponse.TempExceptionDTO> exceptionAPI(@RequestParam Integer flag){
        tempQueryService.CheckFlag(flag);
        return ApiResponse.onSuccess(TempConverter.toTempExceptionDTO(flag));
    }
}
}
