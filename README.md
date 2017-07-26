为什么要用AutoTest？
==========
  *数据驱动测试，测试数据与测试代码分离，测试数据放在csv文件，AutoTest支持数据位置与参数位置不用一一对应，随用随加，极大的方便测试代码维护和调试，后面有示例。*

  *AutoTest支持Sping，支持CXF，Dubbo等服务的WebService接口测试，对http接口测试同样支持。*

  *AutoTest支持WebDriver，支持前端页面自动化测试。项目中有登录京东自动领取优惠券的例子(支持chrome)。*

使用前
======
  因为JUnit 5仅支持jdk1.8及以上，所以需要先安装jdk1.8，安装教程请自行百度。

  IDE方面，Intellij IDEA2016.2开始对 JUnit 5支持 ，下载最新版本即可。

使用说明
========
  JUnit 5仍然支持对@Test 标记测试方法，但若要使用@AutoTest，需要测试方法至少有一个参数，并且file的值不为空。

示例如下：
~~~
@AutoTest(file = "/autotest/simpleTest.csv")

void simpleTest(int testId,String result) {

    System.out.println("这是第 " + testId + " 条测试用例");

    System.out.println(result);

}
~~~
simpleTest.csv文件的内容如下：
~~~
result,testId

SUCCESS,1001

FAIL,1002
~~~
csv文件第一行是参数名，参数名之间以英文逗号,隔开

csv文件第二行开始是参数值，与第一行参数名一一对应，从第二行开始，有几行执行几次测试方法。

比如上面这个测试方法执行后，结果如下：
~~~
这是第 1001 条测试用例

SUCCESS

这是第 1002 条测试用例

FAIL
~~~
未完待续
