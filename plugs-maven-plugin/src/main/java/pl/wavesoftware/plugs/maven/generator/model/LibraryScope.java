/*
 * Copyright (c) 2019 Wave Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pl.wavesoftware.plugs.maven.generator.model;

/**
 * The scope of a library. The common {@link #COMPILE}, {@link #RUNTIME} and
 * {@link #PROVIDED} scopes are defined here and supported by the common
 * {@link Layouts}.
 *
 * A custom {@link Layout} can handle additional scopes as required.
 *
 * @author <a href="mailto:krzysztof.suszynski@wavesoftware.pl">Krzysztof Suszynski</a>
 * @author Phillip Webb (Spring Boot project)
 * @since 0.1.0
 */
public enum LibraryScope {

  COMPILE("compile"),
  RUNTIME("runtime"),
  PROVIDED("provided"),
  CUSTOM("custom");

  private final String name;

  LibraryScope(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
