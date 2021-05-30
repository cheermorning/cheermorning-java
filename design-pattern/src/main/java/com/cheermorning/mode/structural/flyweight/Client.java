package com.cheermorning.mode.structural.flyweight;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */
public class Client {

    public static void main(String[] args) {

        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite1 = factory.getWbeSiteByType("新闻");

        webSite1.use(new User("Tom"));


        WebSite webSite2 = factory.getWbeSiteByType("博客");

        webSite2.use(new User("Smith"));

        WebSite webSite3 = factory.getWbeSiteByType("微信");

        webSite3.use(new User("Jackson"));

        //Integer valueOf()
    }
}
