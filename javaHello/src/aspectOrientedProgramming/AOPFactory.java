package aspectOrientedProgramming;


/**
 * 我们实现一个工厂，为了方便我们使用该拦截类
 * Created by hewei on 2016/12/11.
 */
public class AOPFactory {
    private static Object getclassInstance(String clzName) {
        Object obj = null;
        try {
            Class cls = Class.forName(clzName);
            obj = (Object)cls.newInstance();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("ClassNotFoundException:" + cnfe.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
    public static Object getAOPProxyedObject(String clzName) {
        Object proxy = null;
        MyHandler handler = new MyHandler();
        Object obj = getclassInstance(clzName);
        if (obj != null) {
            proxy = handler.bind(obj);
        } else {
            System.out.println("Can't get the proxyobj");
            //throw
        }
        return proxy;
    }
}

class ClientTest {
    public static void main(String[] args) {
        StudentInfoService studentInfo = (StudentInfoService)AOPFactory.getAOPProxyedObject(
                "StudentInfoServiceImpl");
        studentInfo.findInfo("muzi");
    }
}