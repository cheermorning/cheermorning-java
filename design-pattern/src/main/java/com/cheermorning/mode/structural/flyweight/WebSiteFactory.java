package com.cheermorning.mode.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */
public class WebSiteFactory {

    /**
     * 创建一个池集合，存储网站的发布类型
     */
    private Map<String, ConcreteWebSite> pool = new HashMap<String , ConcreteWebSite>();

    public WebSite getWbeSiteByType(String type){
        if(! pool.containsKey(type)){
            pool.put(type, new ConcreteWebSite(type));
        }

        return pool.get(type);
    }
}
