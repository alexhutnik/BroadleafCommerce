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

package org.broadleafcommerce.profile.core.dao;

import java.util.List;

import org.broadleafcommerce.profile.core.domain.CustomerAddress;

public interface CustomerAddressDao {

    public List<CustomerAddress> readActiveCustomerAddressesByCustomerId(Long customerId);

    public CustomerAddress save(CustomerAddress customerAddress);

    public CustomerAddress readCustomerAddressById(Long customerAddressId);

    public void makeCustomerAddressDefault(Long customerAddressId, Long customerId);

    public void deleteCustomerAddressById(Long customerAddressId);

    public CustomerAddress findDefaultCustomerAddress(Long customerId);

    public CustomerAddress create();

}
