package aspectOrientedProgramming;

/**
 * 面向切面编程示例
 * Created by hewei on 2016/12/11.
 */
public class StudentInfoServiceImpl implements StudentInfoService {
    public void findInfo(String name) {
        System.out.println("你输入的名字是：" + name);
    }
}
