#电商项目
- leyou：父工程，管理版本号
- leyou-common：通用的工程：相关工具类,utils,pojo
- leyou-gateway：网关工程：服务路由，请求的过滤，拦截并分发请求
- leyou-item:商品的聚合工程
    1. leyou-item-interface：分享一些pojo，接口，异常
    2. leyou-item-service：商品的微服务，对外提供rest接口的具体实现
- leyou-registry：eureka服务的注册中心
- leyou-search:elasticsearch搜索服务
- leyou-goods-web:获取商品详情页信息
- leyou-upload:上传图片服务
- leyou-user:登录注册功能服务
- leyou-auth：授权中心聚合工程：与登录功能相关
    1. leyou-auth-common(jwt相关的工具类) 
    2. leyou-auth-service(微服务)
- leyou-sms:阿里短信验证功能服务
    1. 短信服务监听MQ消息，收到消息后发送短信;
    2. 其它服务要发送短信时，通过MQ通知短信微服务。
    3. 如：leyou-user-service中UserController的sendVerifyCode(@RequestParam("phone")String phone)发送验证码,
    再通过UserService的sendVerifyCode(String phone)发送消息到rabbitMQ和发送到redis,
    leyou-ssm中的SmsListener监听得到消息发送验证码.
- leyou-cart：购物车服务(与redis交互)
- leyou-order:支付服务(具体看文档)
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
elasticsearch在/home/leyou/elasticsearch/bin
cd elasticsearch/bin
./elasticsearch
无报错注意防火墙是否没关

```
```
redis需要开机启动
redis提供了服务端命令和客户端命令：

- redis-server 服务端命令，可以包含以下参数：
  start 启动
  stop 停止
- redis-cli 客户端控制台，包含参数：
  -h xxx 指定服务端地址，缺省值是127.0.0.1
  -p xxx 指定服务端端口，缺省值是6379
/etc/init.d/redis start
```
- ps:day12/p142 ElasticsearchTest没完成
- 解决：linux未安装：IK分词器插件
- Elasticsearch已解决：原因在于数据需要重写导入，重新导入sql语句
- ps:day12与13不熟悉，后面需要重新复习
- ps:day16短信注册，后面需要根据新的阿里云文档进行更改
- ps:tk.mybatis.mapper.common.Mapper了解如何与数据库交互


- leyou 后台后端代码
- leyou-manage-web 后台界面前端代码
- leyou-portal 前端主界面代码  

- rabbitmq 
- 账号：leyou 密码：123456