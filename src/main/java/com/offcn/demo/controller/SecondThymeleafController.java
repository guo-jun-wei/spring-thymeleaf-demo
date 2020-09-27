package com.offcn.demo.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.offcn.demo.bean.User;

@Controller
public class SecondThymeleafController {
    /**
     * 访问localhost:8080 页面
     * 将数据message填充到templates/index2.html
     *
     * @param model
     * @return
     */
    @GetMapping("/second")
    public String indexPage(Model model) {
        String message = "dddddd";
        User u = new User();
        u.setId(1);
        u.setName("优就业");
        u.setAge(18);

        Map<String, Object> map = new HashMap<>();
        map.put("src1", "1.PNG");
        map.put("src2", "2.PNG");
        model.addAttribute("message", message);
        model.addAttribute("user", u);
        model.addAttribute("src", map);
        return "index2";
    }


    @GetMapping("/third")
    public String threePage(Model model) {
        User user1 = new User(1, "zhanagsna", 20);
        User user2 = new User(2, "lisi", 30);
        User user3 = new User(3, "wangwu", 40);
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("list", list);
        return "index2";
    }

    @GetMapping("/four")
    public String fourPage(Model model) {
        model.addAttribute("userName", "优就业");
        model.addAttribute("href", "http://www.ujiuye.com");
        return "index2";
    }


    @GetMapping("/five")
    public String fivePage(Model model) {
        model.addAttribute("flag", "yes");
        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");
        return "index2";
    }

    @GetMapping("/six")
    public String sixPage(Model model) {
        return "index6";
    }

    @GetMapping("/seven")
    public String sevenPage(Model model) {
        //日期时间
        Date date = new Date();
        model.addAttribute("date", date);
        //小数的金额
        double price = 128.5678D;
        model.addAttribute("price", price);
        //定义大文本数据
        String str = "Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n";
        model.addAttribute("strText", str);
        //定义字符串
        String str2 = "JAVA-offcn";
        model.addAttribute("str2", str2);
        return "index7";
    }
}