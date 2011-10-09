/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.cms.structure.domain;

import org.broadleafcommerce.openadmin.audit.AdminAuditable;

import java.io.Serializable;

/**
 * Created by bpolster.
 */
public interface StructuredContentFieldData extends Serializable {
    
    public Long getId();

    public void setId(Long id);

    public String getValue();

    public void setValue(String value);

    public StructuredContentFieldData cloneEntity();

    public AdminAuditable getAuditable();

    public void setAuditable(AdminAuditable auditable);
}
