## Servlet的理解
### 生命周期

- 第一次接受请求，实例化servlet并执行init方法
- 开启线程，传入HttpServletRequest&HttpServletResponse执行service方法
- 修改response对象的返回字符串
- 容器关闭，执行destroy方法

### HttpServlet实现
- HttpServlet实现Servlet接口
- 重写service方法处理http请求

### JSP
- 第一次请求时，把hello.jsp转译为hello_jsp.java
- hello_jsp.java 位于d:\tomcat\work\Catalina\localhost\_\org\apache\jsp
- hello_jsp.java是一个servlet
- 把hello_jsp.java 编译为hello_jsp.class
- 执行hello_jsp，生成html
- 通过http协议把html 响应返回给浏览器