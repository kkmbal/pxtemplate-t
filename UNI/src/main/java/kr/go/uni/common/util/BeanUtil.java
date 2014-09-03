package kr.go.uni.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BeanUtil {
    public static <T> T getData(String data, Class<? extends T> targetType) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(data, targetType);
}
}
