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

package pl.wavesoftware.plugs.maven.generator.packager;

import pl.wavesoftware.plugs.maven.generator.filter.Filter;
import pl.wavesoftware.plugs.maven.generator.model.ExecutionConfiguration;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author <a href="mailto:krzysztof.suszynski@wavesoftware.pl">Krzysztof Suszynski</a>
 * @since 0.1.0
 */
@Named
final class PlugPackagerFactoryImpl implements PlugPackagerFactory {

  private final ManifestBuilder manifestBuilder;

  @Inject
  PlugPackagerFactoryImpl(ManifestBuilder manifestBuilder) {
    this.manifestBuilder = manifestBuilder;
  }

  @Override
  public PlugPackager create(
    ExecutionConfiguration configuration,
    Filter filter
  ) {
    return new PlugPackagerImpl(configuration, filter, manifestBuilder);
  }
}
