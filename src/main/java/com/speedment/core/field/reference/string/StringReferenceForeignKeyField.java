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
package com.speedment.core.field.reference.string;

import com.speedment.core.config.model.Column;
import com.speedment.core.field.reference.Getter;
import com.speedment.core.field.reference.Setter;

import java.util.function.Supplier;

/**
 *
 * @author pemi
 * @param <ENTITY> The entity type
 * @param <FK> The foreign entity type
 */
public class StringReferenceForeignKeyField<ENTITY, FK> extends StringReferenceField<ENTITY> {
	
	private final Getter<ENTITY, FK> finder;

    public StringReferenceForeignKeyField(Supplier<Column> columnSupplier, Getter<ENTITY, String> getter, Setter<ENTITY, String> setter, Getter<ENTITY, FK> finder) {
        super(columnSupplier, getter, setter);
		this.finder = finder;
    }

    public FK findFrom(ENTITY entity) {
        return finder.apply(entity);
    }
}