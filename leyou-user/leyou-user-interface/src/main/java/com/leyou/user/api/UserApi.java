package com.leyou.user.api;

import com.leyou.user.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther:cdx
 * @Date:2020-06-06
 * @Description:com.leyou.user.api
 * @Version:1.0
 */
public interface UserApi {
    @GetMapping("query")
    public User queryUser(@RequestParam("username")String username, @RequestParam("password")String password);
}
