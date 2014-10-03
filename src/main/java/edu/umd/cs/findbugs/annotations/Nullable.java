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

import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierNickname;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.CLASS;
import static javax.annotation.meta.When.UNKNOWN;

/**
 * The annotated element could be null under some circumstances. In general, this means developers will have to read
 * the documentation to determine when a null value is acceptable and whether it is neccessary to check for a null
 * value. When this annotation is applied to a method it applies to the method return value.
 *
 * @deprecated use {@link javax.annotation.Nullable} instead
 */
@Documented
@Target(value = {FIELD, METHOD, PARAMETER, LOCAL_VARIABLE})
@Retention(value = CLASS)
@javax.annotation.Nonnull(when = UNKNOWN)
@TypeQualifierNickname
@Deprecated
public @interface Nullable {
}
