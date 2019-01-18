package com.jk.bean;

import java.io.Serializable;
import java.util.List;

public class Boostrap implements Serializable {
    private Integer id;
    private Integer pid;
    private String text;
    private String icon;
    private String selectedIcon;
    private String color;
    private String backColor;
    private String href;
    private List<Boostrap> nodes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSelectedIcon() {
        return selectedIcon;
    }

    public void setSelectedIcon(String selectedIcon) {
        this.selectedIcon = selectedIcon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBackColor() {
        return backColor;
    }

    public void setBackColor(String backColor) {
        this.backColor = backColor;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<Boostrap> getNodes() {
        return nodes;
    }

    public void setNodes(List<Boostrap> nodes) {
        this.nodes = nodes;
    }
}
