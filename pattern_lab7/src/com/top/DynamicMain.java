package com.top;

​import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface DynamicSubject{
    public Object action();
}

class DynamicRealSubject implements DynamicSubject{

    DynamicRealSubject(){}
    public Object action() {
        // do somthing
        return null;
    }
}

class DynamicProxyHandler implements InvocationHandler{
    private DynamicRealSubject realSubject;
    DynamicProxyHandler(){
        realSubject = new DynamicRealSubject();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(realSubject, args);
        return result;
    }
}

public class DynamicMain {
    public static void main(String[] args) {
        DynamicSubject proxy = (DynamicSubject)Proxy.newProxyInstance(DynamicMain.class.getClassLoader()
        , new Class[]{DynamicSubject.class}
        , new DynamicProxyHandler());

        proxy.action();
    }
}
