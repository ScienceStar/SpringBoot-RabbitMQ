import org.junit.Test;

/**
 * @ProjectName: SpringBoot-Mqtt
 * @Package: PACKAGE_NAME
 * @ClassName: ConditionDemo
 * @Author: LXC
 * @Description: 条件路由
 * @Date: 2021/4/22 10:48 am
 */
public class ConditionDemo {

    @Test
    public void testCondition() {
        int num = 106;

        System.out.println(this.conditionBack(num));
    }

    public String conditionBack(int params) {
        return params >= 100 ? "优秀" : params < 100 && params >= 80 ? "良好" : params < 80 && params >= 60 ? "及格" : params < 60 ? "不及格" : "正常";
    }
}
