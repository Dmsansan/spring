## spring beans自动装配的几种方式

* no - 通过手动设置ref关联注入的beans
* byName - 通过类名注入
* byType - 通过类型注入
* constructor – 在构造函数参数的byType方式
* autodetect – 如果找到默认的构造函数，使用“自动装配用构造”; 否则，使用“按类型自动装配”

## spring+jdbc数据库操作

* 使用jdbcTemplate可以自动完成数据库连接的建立与关闭，去除部分冗余代码

## spring的AOP(面向切面编程)

* MethodBeforeAdvice - 方法前通知
* MethodAfterAdvice - 方法后通知
* ThowsAdvice - 抛出后通知
* MethodInterceptor - 环绕通知