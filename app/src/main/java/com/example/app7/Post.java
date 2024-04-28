package com.example.app7;

public class Post {
    private String id;

    public Post(String id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    private String name;
    private String group;
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGroup() {
        return group;
    }
}
