package cn.labzen.javafx.example.stage;

import cn.labzen.javafx.stage.LabzenStage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AboutStage extends LabzenStage {

  @NotNull
  @Override
  public String primaryView() {
    return "AboutView";
  }

  @Nullable
  @Override
  public String title() {
    return "about dean.";
  }
}
