package edu.umd.cs.findbugs.annotations;
/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*  http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * This annotation is used to denote a method whose return value should always be checked when invoking the method.
 * The checker treats this annotation as inherited by overriding methods.
 *
 * @deprecated use {@link javax.annotation.CheckReturnValue} instead
 */
@Documented
@Target(value = {METHOD, CONSTRUCTOR})
@Retention(value = CLASS)
@Deprecated
public @interface CheckReturnValue {

    /**
     * The priority of the warning.
     *
     * @return The priority of the warning.
     * @deprecated use {@link #confidence()} instead
     */
    @Deprecated
    Priority priority() default Priority.MEDIUM;

    /**
     * The confidence of the warning.
     *
     * @return The confidence of the warning.
     */
    Confidence confidence() default Confidence.MEDIUM;

    /**
     * A textual explaination of why the return value should be checked.
     *
     * @return A textual explaination of why the return value should be checked.
     */
    String explanation() default "";
}
