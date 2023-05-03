package com.example.foodapp;

import com.example.foodapp.Domain.CategoryDomain;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CategoryListResponse {

    public List<CategoryDomain> data = new ArrayList();

}
