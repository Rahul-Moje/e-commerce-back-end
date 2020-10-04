package com.myorganisation.mydepartment.ecommerce;

public enum SubCategory {

    MOBILE("Mobile Phones");

    private String description;

    SubCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
