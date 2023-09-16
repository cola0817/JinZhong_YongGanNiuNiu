package edu.jzxy.cbq.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Cola0817
 * @name StreamBasic
 * @date 2023/9/16 9:43
 * @since 1.0.0
 */
public class StreamBasicUse {

    /**
     * stream 过滤
     * @param userBeanList userBeanList
     * @return 根据条件过滤后的 list
     */
    public List<UserBean> filterByStream(List<UserBean> userBeanList){
        return
            userBeanList.stream()
            .filter(userBean -> userBean.getAge() >20 )
                .collect(Collectors.toList());
    }

    /**
     * 根据 forEach 过滤
     * @param userBeanList userBeanList
     * @return 根据条件过滤后的 list
     */
    public List<UserBean> filterByForEach(List<UserBean> userBeanList){
        List<UserBean> newUserBeanList = new ArrayList<>();
        userBeanList.forEach(userBean -> {
            if (userBean.getAge() > 20){
                newUserBeanList.add(userBean);
            }
        });
        return newUserBeanList;

    }

    /**
     * 根据 Iterator 过滤
     * @param userBeanList userBeanList
     * @return 根据条件过滤后的 list
     */
    public List<UserBean> filterByIterator(List<UserBean> userBeanList){
        List<UserBean> newUserBeanList = new ArrayList<>();

        Iterator<UserBean> iterator = userBeanList.iterator();
        while (iterator.hasNext()){
            UserBean userBean = iterator.next();
            if (userBean.getAge() > 20){
                newUserBeanList.add(userBean);
            }
        }
        return newUserBeanList;

    }

    /**
     * 比较 compare
     * @param userBeanList userBeanList
     * @return 比较后的 list
     */
    public List<UserBean> sortedByCompare(List<UserBean> userBeanList){
        return userBeanList.stream().sorted(new Comparator<UserBean>() {
            @Override
            public int compare(UserBean o1, UserBean o2) {
                return o2.getAge() - o1.getAge();
            }
        }).collect(Collectors.toList());
    }



}
