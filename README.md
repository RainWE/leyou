#电商项目
+ leyou：父工程，管理版本号
+ leyou-common：通用的工程：utils,pojo
- leyou-gateway：网关工程：服务路由，请求的过滤，拦截并分发请求
* leyou-item:商品的聚合工程
    1. leyou-item-interface：分享一些pojo，接口，异常
    2. leyou-item-service：商品的微服务，对外提供rest接口的具体实现
* leyou-registry：eureka服务的注册中心

```
   npm install -g live-server
   live-server --port=9002
   ```
```
start nginx
nginx -s reload
nginx -s stop
```
- ps:未处理（需新建虚拟机）
- day8图片上传未解决，fastDFS与虚拟机nginx未处理完
- dat10 elasticsearch未安装

- leyou 后台后端代码
- leyou-manage-web 后台界面前端代码
- leyou-portal 前端主界面代码  
