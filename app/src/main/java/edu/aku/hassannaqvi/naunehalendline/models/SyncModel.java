package edu.aku.hassannaqvi.naunehalendline.models;


import static edu.aku.hassannaqvi.naunehalendline.core.MainApp._EMPTY_;

public class SyncModel {
    String tableTitle;
    String tableName;
    String status;
    int statusID;
    String message;
    String filter = null;
    String select = null;
    Boolean isUnlocked = false;
    private String info;

    public SyncModel(String tableName) {

        this.tableName = tableName;
        this.tableTitle = tableName.replaceAll("\\d+", "").replaceAll("(.)([A-Z])", "$1 $2");
        this.status = _EMPTY_;
        this.statusID = 0;
        this.message = _EMPTY_;


    }

    public SyncModel(String tableName, String select) {

        this.tableName = tableName;
        this.tableTitle = tableName.replaceAll("\\d+", "").replaceAll("(.)([A-Z])", "$1 $2");
        this.status = _EMPTY_;
        this.statusID = 0;
        this.message = _EMPTY_;
        this.select = select;
    }

    public SyncModel(String tableName, Boolean isUnlocked) {

        this.tableName = tableName;
        this.tableTitle = tableName.replaceAll("\\d+", "").replaceAll("(.)([A-Z])", "$1 $2");
        this.status = _EMPTY_;
        this.statusID = 0;
        this.message = _EMPTY_;
        this.isUnlocked = isUnlocked;
    }

    public SyncModel(String tableName, String select, String filter) {

        this.tableName = tableName;
        this.tableTitle = tableName.replaceAll("\\d+", "").replaceAll("(.)([A-Z])", "$1 $2");
        this.status = _EMPTY_;
        this.statusID = 0;
        this.message = _EMPTY_;
        this.select = select;
        this.filter = filter;

    }

    public String getTableTitle() {
        return tableTitle;
    }

    public void setTableTitle(String tableTitle) {
        this.tableTitle = tableTitle;
    }

    public String gettableName() {
        return tableName;
    }

    public void settableName(String tableName) {
        this.tableName = tableName;
    }

    public Boolean getUnlocked() {
        return isUnlocked;
    }

    public void setUnlocked(Boolean unlocked) {
        isUnlocked = unlocked;
    }

    public String getstatus() {
        return status;
    }


    public void setstatus(String status) {
        this.status = status;
    }

    public int getstatusID() {
        return statusID;
    }

    public void setstatusID(int statusID) {
        this.statusID = statusID;
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getFilter() {

        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }
}
