package com.bdqn.toop;

import com.bdqn.pojo.Menu;
import sun.reflect.generics.tree.Tree;

import java.util.List;

public class tree {
    public String dealJsonFormat(List<Menu> tList){
        StringBuilder json = new StringBuilder();
        for (Menu tree : tList) {
            json.append("{\"id\":" +String.valueOf(tree.getMid()));
            json.append(",\"text\":\"" +tree.getMname() + "\"");
            json.append(",\"state\":\"closed\"");
            json.append("},");		}
        String str = json.toString();
        str = str.substring(0, str.length()-1);
        System.out.println("---------"+str);
        return str;
    }

}
