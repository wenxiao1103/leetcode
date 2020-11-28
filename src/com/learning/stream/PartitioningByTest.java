package com.learning.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author xiaowen
 * @date 2020/11/27 5:20 下午
 */
public class PartitioningByTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "springboot", "HTML5","nodejs","CSS3");
        Map<Boolean, List<String>> result = list.stream().collect(Collectors.partitioningBy(obj -> obj.length() > 4));
        // 长度大于四：[springboot, HTML5, nodejs]
        System.out.println("长度大于四："+result.get(true));
        // 长度小于等于四：[java, CSS3]
        System.out.println("长度小于等于四："+result.get(false));
    }
}

