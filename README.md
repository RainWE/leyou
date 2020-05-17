#电商项目
+ leyou：父工程，管理版本号
+ leyou-common：通用的工程：utils,pojo
- leyou-gateway：网关工程：服务路由，请求的过滤，拦截并分发请求
* leyou-item:商品的聚合工程
    1. leyou-item-interface：分享一些pojo，接口，异常
    2. leyou-item-service：商品的微服务，对外提供rest接口的具体实现
* leyou-registry：eureka服务的注册中心
