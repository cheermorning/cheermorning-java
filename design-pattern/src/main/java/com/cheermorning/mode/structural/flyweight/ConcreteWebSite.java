package com.cheermorning.mode.structural.flyweight;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */
public class ConcreteWebSite extends WebSite {


    private String type = ""; // 网站类型：博客、新闻、公众号、大屏

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布方式为\"" + type + "\", 正在使用中 ..., " + "使用者是\"" + user.getName() + "\"");
    }
}
