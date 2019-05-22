## IDEA开发问题
### 控制台乱码问题
- 设置idea的运行环境编码(idea也是java写的)，在/idea安装目录/bin/idea64.exe.vmoptions中添加`vm options=-Dfile.encoding=UTF-8`
- 设置tomcat编码，在server配置项vm options中配置`vm options=-Dfile.encoding=UTF-8`
- 如果是post请求，需要在代码中设置request.setCharacterEncoding("UTF-8")
- 如果是get请求，未发现编码问题
### 文件上传问题
文件上传目录需要指定项目发布的路径，而不是当前路径，否则会出现资源不能访问