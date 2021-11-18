package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.repository.CompRepository;
@Controller
public class JpaHukusyuController {
	
	@Autowired
	CompRepository repository;
	
    @RequestMapping(path = "/jpaHukusyu", method = RequestMethod.GET)
    public String viewPage(Model model) {
        
    	model.addAttribute("comps",repository.findByCompnumberOrCompnameLike(1,"%Syst%"));
    	
        // 表示するHTMLはreturnの後ろに書く。
        // 今回の場合はtemplatesフォルダの中にあるsessionフォルダにあるlogin.htmlを表示する。
        return "jpaHukusyu";
    }
}