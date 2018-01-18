package com.library.librarySystem.model;

public class Result {
    String name;
    String result;

    public Result(String name, String result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
