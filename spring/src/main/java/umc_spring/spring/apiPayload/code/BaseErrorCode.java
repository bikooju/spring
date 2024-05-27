package umc_spring.spring.apiPayload.code;

public interface BaseErrorCode {

    public ErrorReason getReason();

    public ErrorReason getReasonHttpStatus();
}
