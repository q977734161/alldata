/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.flinkx.throwable;

import org.apache.flink.util.FlinkException;

/**
 * @author tiezhu
 * @implNote Base class of all DT specific unchecked exception
 */
public class FlinkxException extends FlinkException {

    private static final long serialVersionUID = 2861589615825583973L;

    /**
     * Creates a new Exception with the given message and null as the cause.
     *
     * @param message The exception message
     */
    public FlinkxException(String message) {
        super(message);
    }

    /**
     * Creates a new exception with a null message and the given cause.
     *
     * @param cause The exception that caused this exception
     */
    public FlinkxException(Throwable cause) {
        super(cause);
    }

    /**
     * Creates a new exception with the given message and cause.
     *
     * @param message The exception message
     * @param cause The exception that caused this exception
     */
    public FlinkxException(String message, Throwable cause) {
        super(message, cause);
    }
}