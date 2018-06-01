为什么要用AutoTest？
==========
    测试数据与测试代码分离，测试数据放在csv文件中，测试方法支持对象参数。

    AutoTest支持Sping，支持CXF，Dubbo等服务的WebService接口测试，对http接口测试同样支持。

    AutoTest支持WebDriver，支持前端页面自动化测试。
  
    AutoTest支持JUnit 5，只需要在测试方法上标注@AutoTest 即可，不再需要@RunWith  @ExtendWith等注解。
    
    AutoTest支持MyBatis，自动生成增删查改方法，方便操作数据库。
    

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

void simpleTest(int testId, String result) {

    System.out.println("这是第 " + testId + " 条测试用例");

    System.out.println(result);

}
~~~
simpleTest.csv文件的内容：
~~~
result,testId

SUCCESS,1001

FAIL,1002
~~~
csv文件第一行是参数名，参数名之间以英文逗号,隔开

csv文件第二行开始是参数值，与第一行参数名一一对应，从第二行开始，有几行则执行几次测试方法。

运行上面的测试方法后，结果如下：
~~~
这是第 1001 条测试用例

SUCCESS

这是第 1002 条测试用例

FAIL
~~~
