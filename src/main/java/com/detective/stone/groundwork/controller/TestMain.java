package com.detective.stone.groundwork.controller;

import com.detective.stone.groundwork.model.TestModel;

/**
 * @author Detective Stone
 * Create time 2018/12/19 9:56
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        TestModel model = new TestModel();
        model.setId(1L);
        Long id = (long) model.getClass().getMethod("getId", null).invoke(model);
        System.out.println(id);
    }
}
