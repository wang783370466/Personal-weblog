使用mabatis生成器需要修改generatorConfig.xml中信息：
        1.驱动包位置（文件中搜索classPathEntry，在本地maven库中，可以通过setting -> 搜索Maven查看maven库地址）
        2.数据库连接信息（文件中搜索jdbcConnection）
        3.想要生成的数据库表名（文件中搜索tableName）
  

generatorConfig.xml 中"http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd"抛红解决方案：
     浏览器输入"http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd"下载文件
     ->idea
      -> setting 
      -> 搜索DTD 
      ->点击Schemas and DTDs 
      ->新增 
      -> url:"http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd", File:选择下载文件
    
生成器执行方式：
    添加maven并运行命令
    在界面最上方的导航栏，点击 Run 
    -->Edit Configuration
    --> 点击+号 
    -->选择Maven
    -->  输入命令  mybatis-generator:generate -e