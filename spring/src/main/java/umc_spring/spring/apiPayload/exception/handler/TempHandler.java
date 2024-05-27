package umc_spring.spring.apiPayload.exception.handler;

import umc_spring.spring.apiPayload.code.BaseErrorCode;
import umc_spring.spring.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
