package com.example.tech_wuliao.entity;

/**
 * description
 *
 * @author wuye 2021/09/03 14:18
 */
public class TechGoods {

    private String factory;
    private String wuliao;
    private String picture;
    private String description;
    private String content;
    private String contentDesc;
    private String buy;

    public TechGoods() {
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getWuliao() {
        return wuliao;
    }

    public void setWuliao(String wuliao) {
        this.wuliao = wuliao;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentDesc() {
        return contentDesc;
    }

    public void setContentDesc(String contentDesc) {
        this.contentDesc = contentDesc;
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    @Override
    public String toString() {
        return "TechGoods{" +
                "factory='" + factory + '\'' +
                ", wuiao='" + wuliao + '\'' +
                ", picture='" + picture + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", contentDesc='" + contentDesc + '\'' +
                ", buy='" + buy + '\'' +
                '}';
    }
}
