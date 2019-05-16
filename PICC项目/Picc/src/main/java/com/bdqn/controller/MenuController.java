package com.bdqn.controller;

import com.bdqn.common.web.BaseController;
import com.bdqn.pojo.Menu;
import com.bdqn.service.MenuService;
import com.bdqn.toop.tree;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class MenuController extends BaseController {
    @Resource
    private MenuService menuService;

    @PostMapping("shu")
    public String shu(Integer rid) {
        /*System.out.println("kaishi");
        tree tre = new tree();
        String str = "";
        StringBuilder json = new StringBuilder();
        // 获得根节点
        List<Menu> menuList = menuService.shu(rid);
        for (Menu treeRoot : menuList) {
            // 拼接根节点
            json.append("[");
            json.append("{\"id\":" + String.valueOf(treeRoot.getId()));
            json.append(",\"text\":\"" + treeRoot.getMname() + "\"");
            json.append(",\"state\":\"open\"");
            // 获取根节点下的所有子节点
            List<Menu> treeList = menuService.zi(treeRoot.getId());
            // 遍历子节点下的子节点
            if (treeList != null && treeList.size() != 0) {
                json.append(",\"children\":[");
                for (Menu t : treeList) {
                    json.append("{\"id\":" + String.valueOf(t.getId()));
                    json.append(",\"text\":\"" + t.getMname() + "\"");
                    json.append(",\"state\":\"open\"");
                    // 该节点有子节点
                    // 设置为关闭状态,而从构造异步加载tree
                    List<Menu> tList = menuService.zi(t.getId());
                    if (tList != null && tList.size() != 0) {// 存在子节点
                        json.append(",\"children\":[");
                        json.append(tre.dealJsonFormat(tList));
                        // 存在子节点的都放在一个工具类里面处理了
                        json.append("]");
                    }
                    json.append("},");
                }
                str = json.toString();
                str = str.substring(0, str.length() - 1);
                str += "]}]";
            }


        }*/
        int i=0;
        int j=0;
        List<Menu> menuList = menuService.shu(rid);
        String ss="";
        ss+="[";
        for( Menu menu : menuList )
        {
            j++;
            ss+="{";
            ss += "\"text\": \""+menu.getMname().toString()+"\",\"iconCls\": \"icon-index\",\"state\": \"closed\"";
            List<Menu> treeList = menuService.zi(rid,menu.getMid());   //判断当前节点是否还有子节点
            if(treeList.size()==0){ //没有子节点  设置 state 为空
//                ss+=String.format("\"id\": \"%s\", \"text\": \"%s\", \"iconCls\": \"\", \"state\": \"\"", menu.getId() , menu.getMname());
            }else{        // 还有子节点 设置 state为closed

                ss+=",\"children\":[";
                for(  Menu menus : treeList ){
                    i++;
                    System.out.println(treeList.size()+"////////////////////////////"+i);
                    ss += "{\"text\": \""+menus.getMname().toString()+"\",\"iconCls\": \"icon-huisuo\",\"attributes\": {\"url\":\""+menus.getMurl()+"\"}}";
                    if (treeList.size() != i){
                        ss+=",";
                    }

                }
                i=0;
                ss+="]";
            }
            ss+="},";
        }

        ss=ss.substring(0, ss.length() - 1);
        ss+="]";

        return ss;
    }
}