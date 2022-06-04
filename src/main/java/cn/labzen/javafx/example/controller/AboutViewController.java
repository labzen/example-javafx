package cn.labzen.javafx.example.controller;

import cn.labzen.javafx.stage.StageHandler;
import cn.labzen.javafx.view.LabzenView;
import com.google.common.collect.Maps;
import javafx.stage.Stage;
import org.jetbrains.annotations.Nullable;

import java.net.URL;
import java.util.ResourceBundle;

public class AboutViewController extends LabzenView {

  @Override
  public void initialize(@Nullable URL location, @Nullable ResourceBundle resources) {
    this.wrapper();
    StageHandler.go(StageHandler.primaryStage().id(), "sub/vb", Maps.newHashMap());
  }
}
