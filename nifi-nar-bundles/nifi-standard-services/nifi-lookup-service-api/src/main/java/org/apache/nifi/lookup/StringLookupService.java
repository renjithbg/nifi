/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.lookup;

import java.util.Map;
import java.util.Optional;

public interface StringLookupService extends LookupService<String> {

    /**
     * Returns an Optional value that corresponds to the given coordinates
     *
     * @param coordinates the coordinates to lookup
     * @return an Optional String that represents the value for the given coordinates
     *
     * @throws LookupFailureException if unable to lookup a value for the given key
     */
    @Override
    Optional<String> lookup(Map<String, String> coordinates) throws LookupFailureException;

    @Override
    default Class<?> getValueType() {
        return String.class;
    }

}
