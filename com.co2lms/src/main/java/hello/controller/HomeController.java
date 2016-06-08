package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

 @RequestMapping("/hello")
 public String hello() {
  return "hello"; //hello.jsp 와 매핑
 }
 
}