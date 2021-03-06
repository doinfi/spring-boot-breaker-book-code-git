package com.jack.thymeleaf;

import com.jack.thymeleaf.entity.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * @author yangyueming
 */
@Controller
@SpringBootApplication
public class Ch72Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch72Application.class, args);
    }

    @RequestMapping(value = "/json",produces={MediaType.APPLICATION_JSON_VALUE})
    public String json(Model model) {
        Person single = new Person("aa",11);
        model.addAttribute("single", single);
        return "jsonView";
    }

    @Bean
    public MappingJackson2JsonView jsonView(){
        MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
        return jsonView;
    }

    @RequestMapping("/")
    public String index(Model model) {
        Person single = new Person("aa", 11);

        List<Person> personList = new ArrayList<Person>();
        Person p1 = new Person("xx", 11);
        Person p2 = new Person("yy", 22);
        Person p3 = new Person("zz", 33);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        model.addAttribute("singlePerson", single);
        model.addAttribute("personList", personList);

        return "index";
    }
}
