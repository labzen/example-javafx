package cn.labzen.javafx.example.init;

import cn.labzen.javafx.view.ViewDispatcher;
import org.jetbrains.annotations.NotNull;

public class PrimaryDispatcher implements ViewDispatcher {

  @NotNull
  @Override
  public String dispatch() {
    return "AppView";
  }
}
