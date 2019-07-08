package spi;

/**
 * @Description :示例接口实现类
 * @Reference :
 * @Author : yihang.lv
 * @CreateDate : 2019-07-08 14:28
 * @Modify:
 **/
public class ApiImpl implements Api{
    public void sayHello() {
        System.out.println("this is a *ApiImpl* function demo");
    }

    public void sayHello2() {
        System.out.println("this is a *ApiImpl* function demo2");
    }

    public void sayHello3() {
        System.out.println("this is a *ApiImpl* function demo3");
    }
}
