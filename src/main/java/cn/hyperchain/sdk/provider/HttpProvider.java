package cn.hyperchain.sdk.provider;

import cn.hyperchain.sdk.exception.RequestException;

import java.util.Map;

/**
 * @ClassName: NetworkProvider
 * @Description:
 * @author: tomkk
 * @date: 2019-03-12
 */

public interface HttpProvider {
    String post(String body, Map<String, String> headers) throws RequestException;

    PStatus getStatus();

    String getUrl();
}
