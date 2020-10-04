package com.myorganisation.mydepartment.ecommerce;

public enum Category {

    ELECTRONICS("Electronics Department");

    private String description;

    Category(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
