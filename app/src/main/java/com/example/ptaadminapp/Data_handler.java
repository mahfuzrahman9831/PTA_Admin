package com.example.ptaadminapp;

public class Data_handler {

    private String winprize;
    private String killprize;
    private String type;
    private String version;
    private String map;

    public Data_handler(String winprize, String killprize, String type, String version, String map) {
        this.winprize = winprize;
        this.killprize = killprize;
        this.type = type;
        this.version = version;
        this.map = map;
    }

    public String getWinprize() {
        return winprize;
    }

    public void setWinprize(String winprize) {
        this.winprize = winprize;
    }

    public String getKillprize() {
        return killprize;
    }

    public void setKillprize(String killprize) {
        this.killprize = killprize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }
}
