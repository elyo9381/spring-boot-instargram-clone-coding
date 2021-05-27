package com.cos.photogramstart.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Map;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class CMRespDto<T> {
    private int code; // 1(성공) , -1(실패)
    private String message;
    private T data;

}