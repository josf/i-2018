/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.josneyo.i2018.topicos2.serializacao.exercise2;

import java.io.*;

/**
 *
 * @author Pichau
 */
public class AnotherNotSerializable implements Serializable {
    public String name;
    public String color;
    public int number;
    
    public void colorCheck(){
        System.out.println(name + "likes the color "+ color);
    }

}
