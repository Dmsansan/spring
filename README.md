## spring beans自动装配的几种方式

* no - 通过手动设置ref关联注入的beans
* byName - 通过类名注入
* byType - 通过类型注入
* constructor – 在构造函数参数的byType方式
* autodetect – 如果找到默认的构造函数，使用“自动装配用构造”; 否则，使用“按类型自动装配”