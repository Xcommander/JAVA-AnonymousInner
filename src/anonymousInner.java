import java.util.ArrayList;

/**
 * Created by xulinchao on 2016/1/30.
 */
public class anonymousInner {
    public void excute(){}

    public static void main(String[] args) {
        /*1 第一种写法的匿名内部类*/
        /*
        * 这里解释下new anonymousInner(){}；其实分为以下几个阶段
        * （1）public class anonymousInnerTest extends anonymousInner{}
        * （2）new anonymousInnerTest()对象
        * 因为anonymousInnerTest这个子类的名字我们是看不见的，所以我们把这个叫做匿名类，又因为在一个方法体内部，所以综合起来
        * 叫做匿名内部类。一定要注意是否有{}，有就是匿名类
        *
        * */
        anonymousInner anonymousInner=new anonymousInner(){
            @Override
            public void excute() {
                System.out.println("我是第一种匿名内部类");
            }
        };
        anonymousInner.excute();

        /*2 第二种匿名内部类的写法*/
        new anonymousInner(){
            @Override
            public void excute() {
                System.out.println("我是第二种匿名内部类");
            }
            /*这种写法就是在匿名子类的类局部代码块中调用其类方法。
            * 局部代码块内的语句是在创建该类的实例后由类加载器隐式立即执行的。
            **/
            {
                excute();
            }
        }.excute();
        new ArrayList<String>(){
            @Override
            public boolean add(String s) {
                return super.add(s);
            }
        };

    }
}
