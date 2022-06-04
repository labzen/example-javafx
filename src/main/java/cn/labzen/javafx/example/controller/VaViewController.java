package cn.labzen.javafx.example.controller;

import cn.labzen.javafx.stage.StageHandler;
import cn.labzen.javafx.view.LabzenView;
import com.google.common.collect.Maps;

import java.util.Map;

public class VaViewController extends LabzenView {

  public void toB() {
    Map<String, Object> parameters = Maps.newHashMap();
    parameters.put("demo", 123);
    StageHandler.go("sub/vb", parameters);
  }

  public void backApp() {
    StageHandler.back();
  }
}
