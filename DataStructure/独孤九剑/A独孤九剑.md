# 独孤九剑

## 算法题的本质

```
算法思想

解题模板

经典问题
```

算法网站推荐?

https://www.zhihu.com/question/30327092/answer/858490275

常见算法网站收藏

https://blog.csdn.net/varyall/article/details/78691442



刷题站

LeetCode，牛客，洛谷



### 规范解题流程

（1）读题理解

​	  反复读题，理解题目含义

​	  应用题提取中心思想，抽象为数据结构与算法问题

（2）构思解法

​	明确问题的类型，考察点是数据结构还是算法，考察的具体是什么

​	运用绘图的方法把问题图形化



（3）编程验证

​	确定变量和列表名称

​	考虑边界条件

​	数据结构要考虑空值判定

（4）调试优化

​	调试的结果大致分为：错误，异常，未实现

​	错误原因：

​    1）一般语法错误，包括变量写法错误、；符号遗漏、中英文输入法

（5）总结

​	  总结关键步骤，易错点







考察频率

![image-20200605040139321](C:\Users\张秦\AppData\Roaming\Typora\typora-user-images\image-20200605040139321.png)



集合结构

 ![img](https://img-blog.csdn.net/20180807200307368?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI5MzczMjg1/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)







## OJ 数据读取方法

### 每行输入带有空格的数字

示例输入

```
6
2 1
3 2
4 3
5 2
6 1
```

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = sc.nextLine();
        }
    }
}

```

### 输入带有数字和字符

示例输入

```
3
aa
b
ac
bbaac
```

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    String[] strs = new String[count];
    for(int i=0;i<count;i++){
        strs[i] = sc.next();
    }
    //数据读取到strs中
}
```



### 输入带有数字和符号示例输入

```
20,3
```

```java
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] line = in.nextLine().split(",");
    int m = Integer.valueOf(line[0]);
    int k = Integer.valueOf(line[1]);
}
```



输入

```
6
5 3 8 3 2 5
```

读取

```java
Scanner sc = new Scanner(System.in);
int len = sc.nextInt();
int[] arr = new int[len];
for (int i = 0; i < len; i++) {
	arr[i] = sc.nextInt();
}
```







- ### 面试白板写题

  面试白板切勿一上来就写

  - 先问清题目，各方面各种问，题目是什么意思，希望你干什么，你的api以后要拿到怎么用，给谁用？

  - 确认方法的输入输出，希望收到什么样的参数？如果不是这种参数怎么处理，输出什么样的结果？结果的范围是？

  - 和面试官确认边界条件，上限是什么？下限是什么？corner case（极端情况）要充分讨论

  - 写代码时最好不断交流，嘴巴里要说，别就只顾着写

  - 最后要给面试官算法复杂度，注意，这里一定要说清楚是最好、平均、最坏，用词要严谨，这些都是细节







## 时间复杂度

### 概念介绍

算法的效率主要由以下两个复杂度来评估：

**时间复杂度**：评估执行程序所需的时间。可以估算出程序对处理器的使用程度。

**空间复杂度**：评估执行程序所需的存储空间。可以估算出程序对计算机内存的使用程度。



**时间频度**
		一个算法执行所耗费的时间，从理论上是不能算出来的，必须上机运行测试才能知道。但我们不可能也没有必要对每个算法都上机测试，只需知道哪个算法花费的时间多，哪个算法花费的时间少就可以了。并且一个算法花费的时间与算法中语句的执行次数成正比例，哪个算法中语句执行次数多，它花费时间就多。***一个算法中的语句执行次数称为语句频度或时间频度。记为T(n)。***

**时间复杂度**
		前面提到的时间频度T(n)中，n称为问题的规模，当n不断变化时，时间频度T(n)也会不断变化。但有时我们想知道它变化时呈现什么规律，为此我们引入时间复杂度的概念。一般情况下，算法中基本操作重复执行的次数是问题规模n的某个函数，用T(n)表示，若有某个辅助函数f(n)，使得当n趋近于无穷大时，T（n)/f(n)的极限值为不等于零的常数，则称f(n)是T(n)的同数量级函数，记作T(n)=O(f(n))，它称为算法的渐进时间复杂度，简称时间复杂度。

​		注意一点，时间负责度和大O表示法是两个概念

#### 大O表示法

​		像前面用O( )来体现算法时间复杂度的记法，我们称之为大O表示法。算法复杂度可以从最理想情况、平均情况和最坏情况三个角度来评估，由于平均情况大多和最坏情况持平，而且评估最坏情况也可以避免后顾之忧，因此一般情况下，**大O表示法直接表示最坏情况的复杂度**。
​		大O表示法O(f(n)中的f(n)的值可以为1、n、logn、n²等，因此我们可以将O(1)、O(n)、O(logn)、O(n²)分别可以称为常数阶、线性阶、对数阶和平方阶，那么如何推导出f(n)的值呢？我们接着来看推导大O阶的方法。

**推导大O阶**

​		推导大O阶，我们可以按照如下的规则来进行推导，得到的结果就是大O表示法：

```
基本操作，即只有常数项，认为其时间复杂度为O(1)
顺序结构，时间复杂度按加法进行计算

循环结构(while,for)，时间复杂度按乘法进行计算

分支结构(if)，时间复杂度取最大值

判断一个算法的效率时，往往只需要关注操作数量的最高次项，其它次要项和常数项可以忽略

经常将log2n（以2为底的对数）简写成logn
```

​			一般问题都会比较复杂，因此需要许多数学公式推导：通用数学规则

```
加法规则：则T(m,n)=T(m)+T(n)=O(max(f1(n),f2(m)))

乘法规则: 则T(m,n)=T(m)*T(n)=O(f1(n)*f2(m))

常数可去掉: 则T1(m)=O(f(m))  T2(m)=O(c*f(m)) T(m)=T1(m)=T2(m)=O(f(m))		
```

​		在计算时间复杂度中，n 表示的是数据规模，以二分法为例，便表示二分数组的大小。

**常数阶**

```java
  int sum = 0,n = 100; //执行一次  
  sum = (1+n)*n/2; //执行一次  
  System.out.println (sum); //执行一次 
```

​		上面算法的运行的次数的函数为f(n)=3，根据推导大O阶的规则1，我们需要将常数3改为1，则这个算法的时间复杂度为O(1)。如果sum = （1+n）*n/2这条语句再执行10遍，因为这与问题大小n的值并没有关系，所以这个算法的时间复杂度仍旧是O(1)，我们可以称之为常数阶。

**线性阶**
线性阶主要要分析循环结构的运行情况

```java
for(int i=0;i<n;i++){
    //时间复杂度为O(1)的算法
    ...
}
```


上面算法循环体中的代码执行了n次，因此时间复杂度为O(n)。

**对数阶**

```java
int number=1;
while(number<n){
    number=number*2;
    //时间复杂度为O(1)的算法
    ...
}
```


​		可以看出上面的代码，随着number每次乘以2后，都会越来越接近n，当number不小于n时就会退出循环。假设循环的次数为X，则由2^x=n得出x=log₂n，因此得出这个算法的时间复杂度为O(logn)。

**平方阶**
下面的代码是循环嵌套

```java
 for(int i=0;i<n;i++){   
      for(int j=0;j<n;i++){
         //复杂度为O(1)的算法
         ... 
      }
  }
```


​		内层循环的时间复杂度在讲到线性阶时就已经得知是O(n)，现在经过外层循环n次，那么这段算法的时间复杂度则为O(n²)。

综合分析

```java
  for(int i=0;i<n;i++){   
      for(int j=i;j<n;i++){
         //复杂度为O(1)的算法
         ... 
      }
  }
```

​		需要注意的是内循环中int j=i，而不是int j=0。当i=0时，内循环执行了n次；i=1时内循环执行了n-1次，当i=n-1时执行了1次，我们可以推算出总的执行次数为

```
n+(n-1)+(n-2)+(n-3)+……+1
=(n+1)+[(n-1)+2]+[(n-2)+3]+[(n-3)+4]+……
=(n+1)+(n+1)+(n+1)+(n+1)+……
=(n+1)n/2
=n(n+1)/2
=n²/2+n/2
```

​		根据此前讲过的推导大O阶的规则的第二条：只保留最高阶，因此保留n²/2。根据第三条去掉和这个项的常数，则去掉1/2,最终这段代码的时间复杂度为O(n²)。

其他常见复杂度：除了常数阶、线性阶、平方阶、对数阶，还有如下时间复杂度：

```
f(n)=nlogn时，时间复杂度为O(nlogn)，可以称为nlogn阶。
f(n)=n³时，时间复杂度为O(n³)，可以称为立方阶。
f(n)=2ⁿ时，时间复杂度为O(2ⁿ)，可以称为指数阶。
f(n)=n!时，时间复杂度为O(n!)，可以称为阶乘阶。
f(n)=√n时，时间复杂度为O(√n)，可以称为平方根阶。
```

**时间复杂度举例**

![image-20200513140320833](C:\Users\张秦\AppData\Roaming\Typora\typora-user-images\image-20200513140320833.png)



一些错误的写法

```
O(2n)\O(n+10)\O(n^3+n^2) 
与系数无关，与常数无关，只保留最高项
```





#### 复杂度的比较

​		下面将算法中常见的f(n)值根据几种典型的数量级来列成一张表，根据这种表，我们来看看各种算法复杂度的差异。

![image-20200407160326731](C:\Users\张秦\AppData\Roaming\Typora\typora-user-images\image-20200407160326731.png)

​		从上表可以看出，O(n)、O(logn)、O(√n )、O(nlogn )随着n的增加，复杂度提升不大，因此这些复杂度属于效率高的算法，反观O(2ⁿ)和O(n!)当n增加到50时，复杂度就突破十位数了，这种效率极差的复杂度最好不要出现在程序中，因此在动手编程时要评估所写算法的最坏情况的复杂度。

下面给出一个更加直观的图：

![image-20200407160341828](C:\Users\张秦\AppData\Roaming\Typora\typora-user-images\image-20200407160341828.png)

其中x轴代表n值，y轴代表T(n)值（时间复杂度）。T(n)值随着n的值的变化而变化，其中可以看出O(n!)和O(2ⁿ)随着n值的增大，它们的T(n)值上升幅度非常大，而O(logn)、O(n)、O(nlogn)随着n值的增大，T(n)值上升幅度则很小。
常用的时间复杂度按照耗费的时间从小到大依次是：

```
O(1)<O(logn)<O(n)<O(nlogn)<O(n²)<O(n³)<O(2ⁿ)<O(n!)
```









### 复杂度研究

 每次面试一定会问时间复杂度，一定要求掌握，在每次练习完算法题后都要分析



算法中常见时间复杂度

![image-20200513142812331](C:\Users\张秦\AppData\Roaming\Typora\typora-user-images\image-20200513142812331.png)

​		O(n)是一个分水岭，在O(n)之下的只有二分法，其他的算法基本上复杂度肯定是大于O(n)的。比O(n)更优的时间复杂度几乎只能是二分法。这里有一个技巧：用时间复杂度来推导算法是一种策略。







#### 优化时间复杂度的技巧

1）使用if判断，因为if的复杂度为O(1)，例如：一个复杂度为n的数据规模，可以通过if分开成为两个O(n/2)的复杂度。

充分利用已有信息（如DP中的备忘录）

使用某种数据结构

优先级队列 使用的两种场景：

  　 1. 想要根据Map的value值对Map进行排序
        　 2. 想要对某几个元素的集合进行排序，此时可以针对这几个元素定义一个类class

双指针遍历

空间换时间

数据预处理

二分查找

参考

https://blog.csdn.net/tree123tree123/article/details/73129450



#### 关于是否递归的问题

![image-20200513143726159](C:\Users\张秦\AppData\Roaming\Typora\typora-user-images\image-20200513143726159.png)

​		理论上，能不用递归可使用循环解决，就尽量使用循环解决（实在无法解决除外，如二叉树），因为递归可能容易导致StackOverFlow，而且递归不利于阅读，不便于调试。





## 双指针













## 分治思想

定义

![image-20200227172839903](C:\Users\张秦\AppData\Roaming\Typora\typora-user-images\image-20200227172839903.png)

基本策略

![image-20200227172901142](C:\Users\张秦\AppData\Roaming\Typora\typora-user-images\image-20200227172901142.png)

适用情况

![image-20200227172939306](C:\Users\张秦\AppData\Roaming\Typora\typora-user-images\image-20200227172939306.png)

基本步骤

![image-20200227173032496](C:\Users\张秦\AppData\Roaming\Typora\typora-user-images\image-20200227173032496.png)

思维过程

![image-20200227173052049](C:\Users\张秦\AppData\Roaming\Typora\typora-user-images\image-20200227173052049.png)









## 空值判定

https://blog.csdn.net/FAITHZK/article/details/81462575

字符串空值判定

```java
if(str == null){ return null;}
    if(str.trim().equals("")){
    	return str;
}
```



数组空值判定







### 其他

#### 程序运行时间记录操作



#### 小数点设置操作