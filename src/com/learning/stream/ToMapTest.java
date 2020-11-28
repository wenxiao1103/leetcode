package com.learning.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author xiaowen
 * @date 2020/11/27 4:51 下午
 */
public class ToMapTest {
    public static void main(String[] args) {
        List<UserBo> list = new ArrayList<>();
        list.add(new UserBo(100, "Mohan"));
        list.add(new UserBo(100, "Sohan"));
        list.add(new UserBo(300, "Mahesh"));
        Map<Integer, Object> map1=list.stream().collect(Collectors.toMap(UserBo::getUserId, v -> v, (v1, v2)-> v1));
        map1.forEach((v1, v2) -> System.out.println("Key: " + v1 +", value: "+ v2));
        Map<Integer, Object> map2 = list.stream() .collect(Collectors.toMap(UserBo::getUserId, v -> v, (k, v) -> v));
        map2.forEach((v1, v2) -> System.out.println("Key: " + v1 +", value: "+ v2));

    }

}
class UserBo{
    private int UserId;
    private String UserName;
    public UserBo(int userId, String userName) {
        super();
        UserId = userId;
        UserName = userName;
    }
    public int getUserId() {
        return UserId;
    }
    public void setUserId(int userId) {
        UserId = userId;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    @Override
    public String toString() {
        return "UserBo [UserId=" + UserId + ", UserName=" + UserName + "]";
    }
}

/**使用toMap()函数之后，返回的就是一个Map了，自然会需要key和value。
 toMap()的第一个参数就是用来生成key值的，第二个参数就是用来生成value值的。
 第三个参数用在key值冲突的情况下：如果新元素产生的key在Map中已经出现过了，第三个参数就会定义解决的办法。
 在例子中
 .collect(Collectors.toMap(UserBo::getUserId, v -> v, (v1, v2) -> v1));
 第一个参数UserBo::getUserId 表示选择UserBo的getUserId作为map的key值；
 第二个参数v -> v表示选择将原来的对象作为map的value值；
 第三个参数(v1, v2) -> v1中，如果v1与v2的key值相同，选择v1作为那个key所对应的value值。
 */
