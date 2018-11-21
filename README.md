新特性：
==========
    1.自动生成测试用例
    
    2.测试代码更简洁，全程都是对象传递
    
    3.数据准备更方便，可根据需要自动生成csv
    
    4.数据验证更容易，直接断言数据库对象
    
    5.配置文件更简单，只需一个数据库连接配置
    

使用前
======
    因为JUnit 5仅支持jdk1.8及以上，所以需要先安装jdk1.8，安装教程请自行百度。

    IDE方面，Intellij IDEA2016.2开始对 JUnit 5支持 ，下载最新版本即可。

使用说明
========
    JUnit 5仍然支持对@Test 标记测试方法，但若要使用@AutoTest，需要测试方法至少有一个参数，并且file的值不为空。

示例：
~~~
@AutoTest(file = "/autotest/simpleTest.csv")

void simpleTest(int testId, User user) {

    System.out.println("这是第 " + testId + " 条测试用例");

    System.out.println(user.getName());

}
~~~
simpleTest.csv文件的内容：
~~~
name,age,testId

Lili,18,1001

Zhangsan,19,1002
~~~
csv文件第一行是参数名，参数名之间以英文逗号,隔开

csv文件第二行开始是参数值，与第一行参数名一一对应，从第二行开始，有几行则执行几次测试方法。

运行上面的测试方法后，结果如下：
~~~
这是第 1001 条测试用例

Lili

这是第 1002 条测试用例

Zhangsan
~~~
生成CSV文件
~~~
运行测试用例时，若没有找到csv文件则会生成对应的文件，如存在则不会生成
~~~
生成数据库操作类
~~~
在AutoTest注解中添加project，值填项目名（与数据库名相同），运行用例时则会自动生成数据库操作类，生成完成后去掉project

@AutoTest(file = "/autotest/simpleTest.csv" , project = "school")
~~~

