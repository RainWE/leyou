#电商项目
- leyou：父工程，管理版本号
- leyou-common：通用的工程：utils,pojo
- leyou-gateway：网关工程：服务路由，请求的过滤，拦截并分发请求
- leyou-item:商品的聚合工程
    1. leyou-item-interface：分享一些pojo，接口，异常
    2. leyou-item-service：商品的微服务，对外提供rest接口的具体实现
- leyou-registry：eureka服务的注册中心

```
前端交互页面启动leyou-portal
   npm install -g live-server
   live-server --port=9002
```
``` 
nginx启动
start nginx
nginx -s reload
nginx -s stop
```
```
前端管理启动leyou-manage-web
- npm run start 启动项目
```
``` 
# 启动fdfs_trackerd服务，停止用stop
service fdfs_trackerd start 
# 检查FastDFS Tracker Server是否启动成功：
ps -ef | grep fdfs_trackerd
# 启动fdfs_storaged服务，停止用stop
service fdfs_storaged start 
# 检查fdfs_storaged是否启动成功：
ps -ef | grep fdfs
# 启动nginx
nginx 
# 停止nginx
nginx -s stop 
# 重新载入配置文件
nginx -s reload
#查看nginx是否已启动成功
ps -ef | grep nginx

# elasticsearch启动在linux
cd elasticsearch/bin
./elasticsearch


```



- leyou 后台后端代码
- leyou-manage-web 后台界面前端代码
- leyou-portal 前端主界面代码  
