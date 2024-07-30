package com.luyz;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class IpCountService {
    // 1.当前类加载成bean以后是一个单例对象，不存在多个对象共享数据的问题
   //  因此不用设置为static静态变量
    private Map<String, Integer> ipCountMap = new HashMap<>();

    // 2. 从容器中直接获取请求对象
    @Resource
    private HttpServletRequest httpServletRequest;

    // 3. 统计ip&次数
    public void count() {
        System.out.println("----触发统计ip&次数方法------");
        //每次调用当前操作，就记录当前访问的IP，然后累加访问次数
        //1.获取当前操作的IP地址
        String ip = httpServletRequest.getRemoteAddr();
        //2.根据IP地址从Map取值，并递增次数
        ipCountMap.put(ip, ipCountMap.getOrDefault(ip, 0) + 1);
    }
}
