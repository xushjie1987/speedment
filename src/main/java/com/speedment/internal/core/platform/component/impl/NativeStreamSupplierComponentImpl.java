/**
 *
 * Copyright (c) 2006-2015, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.internal.core.platform.component.impl;

import com.speedment.Manager;
import com.speedment.Speedment;
import com.speedment.component.StreamSupplierComponent;
import java.util.stream.Stream;

/**
 *
 * @author pemi
 */
public class NativeStreamSupplierComponentImpl extends Apache2AbstractComponent implements StreamSupplierComponent {

    public NativeStreamSupplierComponentImpl(Speedment speedment) {
        super(speedment);
    }

    @Override
    public <ENTITY> Stream<ENTITY> stream(Class<ENTITY> entityClass) {
        return getSpeedment().managerOf(entityClass).nativeStream();
    }

    @Override
    public <ENTITY> Stream<ENTITY> stream(Manager<ENTITY> manager) {
        return manager.nativeStream();
    }

}