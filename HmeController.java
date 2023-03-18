package ai.thirdapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ai.thirdapp.model.Alien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HmeController {
	
	@Autowired
	AlienRepo repo;
    @RequestMapping("/home")
	public String home()
	{
		return "index.jsp";
	}
    
    
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j)
    {
       ModelAndView mv=new ModelAndView();
       mv.setViewName("result.jsp");
    	int k = i+j;
    	mv.addObject("num",k);
    	
        return mv;
    }
    @GetMapping("fetch")
    public String  getall(Model m)
    {
      m.addAttribute("result",repo.findAll());
      return "showaliens.jsp";
    }
    
    @GetMapping("getAlien")
    public String  getAlien(@RequestParam int aid1, Model m)
    {
      System.out.println("for debugging..");
      m.addAttribute("result",repo.getOne(aid1));
      return "showaliens.jsp";
    }
    @RequestMapping("/addAlien")
    public String add(@ModelAttribute ("a1") Alien a)
    {
        repo.save(a);
        return "result.jsp";
    }
	
}
