package com.leyou.auth.service;

import com.leyou.auth.client.UserClient;
import com.leyou.auth.config.JwtProperties;
import com.leyou.common.pojo.UserInfo;
import com.leyou.common.utils.JwtUtils;
import com.leyou.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther:cdx
 * @Date:2020-06-06
 * @Description:com.leyou.auth.service
 * @Version:1.0
 */
@Service
public class AuthService {
    @Autowired
    private JwtProperties jwtProperties;
    @Autowired
    private UserClient userClient;


    public String accredit(String username, String password) {
        //1.根据用户名和密码查询
        User user = this.userClient.queryUser(username, password);
        //2.判断user
        if(user==null){
            return null;
        }
        try {
            //3.jwtUtils生成jwt类型的token
            UserInfo userInfo = new UserInfo();
            userInfo.setId(user.getId());
            userInfo.setUsername(user.getUsername());
            return JwtUtils.generateToken(userInfo,this.jwtProperties.getPrivateKey(),this.jwtProperties.getExpire());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
