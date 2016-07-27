/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package com.dangdang.ddframe.job.api.config;

import com.dangdang.ddframe.job.api.config.fixture.TestSimpleJob;
import com.dangdang.ddframe.job.api.type.simple.SimpleJobConfiguration;

public final class SimpleJobConfigurationTest extends AbstractJobConfigurationTest<SimpleJobConfiguration, SimpleJobConfiguration.Builder> {
    
    @Override
    protected SimpleJobConfiguration getJobConfiguration() {
        return getJobConfigurationBuilder().build();
    }
    
    @Override
    protected SimpleJobConfiguration.Builder getJobConfigurationBuilder() {
        return new SimpleJobConfiguration.Builder("simpleJob", TestSimpleJob.class, "0/1 * * * * ?", 10);
    }
}
