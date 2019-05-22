## Filter的理解
- 在tomcat和servlet之间过滤
- 随tomcat启动
- Filter类似Laravel的pipeline，每个Filter处理之后，在执行下一个Filter
## Listener的理解
Listener 的作用是用于监听 web应用的创建和销毁，以及在其上attribute发生的变化。 
web应用即ServletContext对象(jsp的隐式对象application) 
除了对web应用的监听外，还能监听session和request的生命周期，以及他们的attribute发生的变化。
### Context
- ServletContextListener监听web应用的创建和销毁
- ServletContextAttributeListener监听web应用属性的增删改
### Session
- HttpSessionListener监听session的创建和销毁
- HttpSessionAttributeListener监听session属性的增删改
### Request
- ServletRequestListener监听request的创建和销毁
- ServletRequestAttributeListener监听request属性的增删改