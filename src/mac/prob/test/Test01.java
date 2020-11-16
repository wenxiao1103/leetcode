package mac.prob.test;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.math.BigDecimal;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

//Java8 教程第五章之Streams Collectors groupingBy
public class Test01 {
    public static class User {

        private String name;
        private int price;
        private BigDecimal salary;

    }
//    public static void main(String[] args){
//        List<BIConversion.User> items = Arrays.asList(
//                new User("apple", 10, new BigDecimal("9.99")),
//                new User("banana", 20, new BigDecimal("19.99")),
//                new User("orang", 10, new BigDecimal("29.99")),
//                new User("watermelon", 10, new BigDecimal("29.99")),
//                new User("papaya", 20, new BigDecimal("9.99")),
//                new User("apple", 10, new BigDecimal("9.99")),
//                new User("banana", 10, new BigDecimal("19.99")),
//                new User("apple", 20, new BigDecimal("9.99"))
//        );

//        // 计算名字出现的次数
//        Map<String, Long> counting = items.stream().collect(
//                Collectors.groupingBy(User::getName, Collectors.counting()));
//        System.out.println(counting);
//        // 计算每个人金额是多少
//        Map<String, Integer> sum = items.stream().collect(
//                Collectors.groupingBy(User::getName, Collectors.summingInt(User::getPrice)));
//        Map<String, Long> counting = items.stream().collect(Collectors.groupingBy(User::getName, Collectors.counting()));
//
//        System.out.println(sum);
//    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.get(1);
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
//        SortedSet<Integer> sortedSet = new SortedSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Vector<Integer> vector = new Vector<>();

        ReentrantLock reentrantLock = new ReentrantLock();

        Socket socket = new Socket();
//        ServerSocket serverSocket = new ServerSocket();
    }
}
