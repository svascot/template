package com.wof.ms.template.controller;

import com.wof.ms.template.domain.TemplateService;
import com.wof.ms.template.model.TemplateModel;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handle the methods that call the DemoTemplate domain.
 *
 * @author santiago.vasco
 */
@RestController
@RequestMapping("/template")
public class TemplateController {

  /**
   * Call the method that return a list of DemoTemplate objects.
   * @return an HTTP Status.
   */
  @GetMapping
  public List<TemplateModel> getAll() {
    TemplateService service = new TemplateService();
    return service.getAll();
  }

}
