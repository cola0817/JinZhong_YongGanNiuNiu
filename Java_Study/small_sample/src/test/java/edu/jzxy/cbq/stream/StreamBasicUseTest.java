package edu.jzxy.cbq.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamBasicUseTest {

    private StreamBasicUse streamBasicUse;
    private List<UserBean> userBeanList;

    @BeforeEach
    public void init() {
        UserBean cola = new UserBean(1, "Cola", 21, "2002-05-06");
        UserBean rhf = new UserBean(2, "RHF", 22, "2002-05-06");
        UserBean rh = new UserBean(3, "RH", 23, "2002-05-06");
        UserBean test01 = new UserBean(4, "Test_01", 16, "2002-05-06");
        UserBean test02 = new UserBean(5, "Test_02", 17, "2002-05-06");
        userBeanList = Arrays.asList(cola, rhf, rh,test01,test02);
        streamBasicUse = new StreamBasicUse();
    }

    @Test
    void filterByStream() {
        System.out.println("StreamBasicUseTest.filterByStream");

        System.out.println("过滤前: ");
        userBeanList.forEach(System.out::println);
        System.out.println("过滤后: ");
        List<UserBean> sortedUserBeanList = streamBasicUse.filterByStream(userBeanList);
        sortedUserBeanList.forEach(System.out::println);
    }

    @Test
    void filterByForEach() {
        System.out.println("StreamBasicUseTest.filterByForEach");

        System.out.println("过滤前: ");
        userBeanList.forEach(System.out::println);
        System.out.println("过滤后: ");
        List<UserBean> sortedUserBeanList = streamBasicUse.filterByForEach(userBeanList);
        sortedUserBeanList.forEach(System.out::println);
    }

    @Test
    void filterByIterator() {
        System.out.println("StreamBasicUseTest.filterByIterator");

        System.out.println("过滤前: ");
        userBeanList.forEach(System.out::println);
        System.out.println("过滤后: ");
        List<UserBean> sortedUserBeanList = streamBasicUse.filterByIterator(userBeanList);
        sortedUserBeanList.forEach(System.out::println);
    }

    @Test
    void sortedByCompare() {
        System.out.println("StreamBasicUseTest.sortedByCompare");

        System.out.println("排序前: ");
        userBeanList.forEach(System.out::println);
        System.out.println("排序后: ");
        List<UserBean> sortedUserBeanList = streamBasicUse.sortedByCompare(userBeanList);
        sortedUserBeanList.forEach(System.out::println);
    }
}
