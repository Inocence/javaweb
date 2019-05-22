## J2EE项目配置
### 项目结构
```
project
    src //java代码
    webapp //web目录
        WEB-INF
            classes //编译文件
            lib //依赖jar包
            web.xml //配置
```
### 编译
#### 编译输出路径
idea需要设置项目编译和模块编译输出路径
#### 第三方jar包
需要添加到library中，在编译时链接
### Tomcat部署
#### 直接部署
映射项目目录，启动tomcat
```xml
<Context path="" docBase="F:\\Projects\\JavaProject\\HelloServlet\\webapp" />
```
#### idea部署
- 打包webapp(war_exploded)并放置在项目根目录
- idea自定义catalina的工作目录以及项目war_exploded的路径
- 然后启动tomcat实例
