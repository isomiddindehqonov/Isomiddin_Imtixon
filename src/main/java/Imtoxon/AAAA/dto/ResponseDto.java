package Imtoxon.AAAA.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ResponseDto<T> {
    private Integer code;
    private String massage;
    private T date;


}
