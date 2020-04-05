package com.wof.ms.template.domain;

import com.wof.ms.template.model.TemplateModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TemplateService {

  public List<TemplateModel> getAll(){

    ArrayList<String> pets = new ArrayList<String>(
        Arrays.asList("Alaska", "Agatha", "Conan")
    );

    List<TemplateModel> templates = new ArrayList<>();

    for(int i = 0; i < 5; i++){
      templates.add(new TemplateModel("Name" + i,"Email" + i,pets));
    }

    return templates;
  }

}
