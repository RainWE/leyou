package com.leyou.auth.client;

import com.leyou.user.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Auther:cdx
 * @Date:2020-06-06
 * @Description:com.leyou.auth.client
 * @Version:1.0
 */
@FeignClient("user-service")
public interface UserClient extends UserApi {
}
