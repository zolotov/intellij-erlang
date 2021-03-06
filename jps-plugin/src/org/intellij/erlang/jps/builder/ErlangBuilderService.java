package org.intellij.erlang.jps.builder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.builders.BuildTargetType;
import org.jetbrains.jps.incremental.BuilderService;
import org.jetbrains.jps.incremental.TargetBuilder;
import org.intellij.erlang.jps.rebar.RebarBuilder;

import java.util.Arrays;
import java.util.List;

public class ErlangBuilderService extends BuilderService {
  @NotNull
  @Override
  public List<? extends BuildTargetType<?>> getTargetTypes() {
    return Arrays.asList(ErlangTargetType.PRODUCTION, ErlangTargetType.TESTS);
  }

  @NotNull
  @Override
  public List<? extends TargetBuilder<?, ?>> createBuilders() {
    return Arrays.asList(new ErlangBuilder(), new RebarBuilder());
  }
}
