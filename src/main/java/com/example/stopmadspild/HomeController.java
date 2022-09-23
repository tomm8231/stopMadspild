package com.example.stopmadspild;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/kontakt")
  public String kontakt() {
    return "kontakt";
  }

  @GetMapping("/om-os")
  public String omOs() {
    return "om-os2";
  }

  @GetMapping("/privat")
  public String privat() {
    return "privat";
  }

  @GetMapping("/virksomhed")
  public String virksomhed() {
    return "virksomhed";
  }



  }

