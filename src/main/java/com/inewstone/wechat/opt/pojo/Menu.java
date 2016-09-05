package com.inewstone.wechat.opt.pojo;

public class Menu {
    private Integer id;

    private String menuName;

    private String menuCode;

    private String pmenuCode;

    private String status;

    private String menuCon;

    private String menuDes;

    private String menuUrl;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    public String getPmenuCode() {
        return pmenuCode;
    }

    public void setPmenuCode(String pmenuCode) {
        this.pmenuCode = pmenuCode == null ? null : pmenuCode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMenuCon() {
        return menuCon;
    }

    public void setMenuCon(String menuCon) {
        this.menuCon = menuCon == null ? null : menuCon.trim();
    }

    public String getMenuDes() {
        return menuDes;
    }

    public void setMenuDes(String menuDes) {
        this.menuDes = menuDes == null ? null : menuDes.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}