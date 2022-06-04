package cn.labzen.javafx.example.controller;

import cn.labzen.javafx.stage.StageHandler;
import cn.labzen.javafx.view.LabzenView;
import javafx.fxml.FXML;
import javafx.scene.SubScene;
import javafx.scene.layout.Pane;
import org.jetbrains.annotations.Nullable;

public class VbViewController extends LabzenView {

  @FXML
  public Pane subViewPane;
  @FXML
  private SubScene innerPane;

  private int index = 1;

  @Override
  public void loaded() {
    super.loaded();
    System.out.println("传递来的参数： [demo = " + parameter("demo") + "]");
  }

  public void toC() {
    StageHandler.go("sub/vc");
  }

  public void backApp() {
    StageHandler.back(null, "AppView");
  }

  public void backA() {
    StageHandler.back();
  }

  @Nullable
  @Override
  public Pane regionalPane(@Nullable String id) {
    return subViewPane;
  }

  public void show() {
    go("sub/vb1");
  }

  public void next() {
    if (index >= 3) {
      return;
    }
    go("sub/vb" + ++index);
  }

  public void prev() {
    if (index <= 1) {
      return;
    }
    --index;
    back();
  }
}
