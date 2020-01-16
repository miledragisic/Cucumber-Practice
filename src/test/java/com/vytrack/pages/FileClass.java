package com.vytrack.pages;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class FileClass {


    @Test
   public void test1(){
       File file= new File("/Users/Martiandj/Downloads/grid.txt");



       Assert.assertTrue(file.exists());
   }
}
